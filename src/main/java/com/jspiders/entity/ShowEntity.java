package com.jspiders.entity;
import com.jspiders.enums.ShowStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "shows")
public class ShowEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie-id")
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn(name = "audi-id")
    private AuditoriumEntity auditorium;

    @Column(name ="showTime" )
    private LocalDate showTime;

    @Column(name ="showEndTime" )
    private LocalDate endTime;

    @Enumerated(EnumType.STRING)
    private ShowStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public AuditoriumEntity getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(AuditoriumEntity auditorium) {
        this.auditorium = auditorium;
    }

    public LocalDate getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDate showTime) {
        this.showTime = showTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public ShowStatus getStatus() {
        return status;
    }

    public void setStatus(ShowStatus status) {
        this.status = status;
    }
}
