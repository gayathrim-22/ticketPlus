package com.jspiders.Dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dao.ShowDaoImpl;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;

public class ShowDaoTest{

    public static void main(String[] args) {
        addShowTest();
    }

    public static void addShowTest()
    {
        System.out.println("Testing ADD Show");
        try {

            ShowDaoImpl showDaoImpl = new ShowDaoImpl();
            AuditoriumDaoImpl auditoriumDao = new AuditoriumDaoImpl();
            MovieDaoImpl movieDao = new MovieDaoImpl();

            ShowEntity showEntity = new ShowEntity();
            showEntity.setShowTime(LocalDate.now());
            showEntity.setEndTime(LocalDate.now());
            showEntity.setStatus(ShowStatus.COMPLETED);

            AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
            showEntity.setAuditorium(auditoriumEntity);//link audi to show

            MovieEntity movieEntity = movieDao.getMovie(1l);
            showEntity.setMovie(movieEntity);//link movie to show

            showDaoImpl.addShow(showEntity);//add show to table

            System.out.println("✅ADD Show Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD Show Test FAILED");
            ex.printStackTrace();
        }
    }
}