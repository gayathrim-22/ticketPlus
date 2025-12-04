package com.jspiders.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auditorium")
public class AuditoriumEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="audi_name", nullable = false)
    private String name;
    @Column(name = "seat_rows",nullable = false)
    private Integer seatRows;
    @Column(name = "seat_cols", nullable = false)
    private Integer seatCols;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    private List<ShowEntity> showsList=new ArrayList<>();

    public List<ShowEntity> getShowsList() {
        return showsList;
    }

    public void setShowsList(List<ShowEntity> showsList) {
        this.showsList = showsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(Integer seatRows) {
        this.seatRows = seatRows;
    }

    public Integer getSeatCols() {
        return seatCols;
    }

    public void setSeatCols(Integer seatCols) {
        this.seatCols = seatCols;
    }

    @Override
    public String toString() {
        return "AuditoriumEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seatRows=" + seatRows +
                ", seatCols=" + seatCols +
                ", showsList=" + showsList +
                '}';
    }
}
