package com.jspiders.Dao;

import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;

import java.util.List;

public class MovieDaoTest {

    public static void main(String[] args) {
//        testAddMovie();

//        getMovieStatusTest();
        getMovieTitleTest();
    }


    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {
            MovieDaoImpl movieDao = new MovieDaoImpl();
            MovieEntity movieEntity=new MovieEntity();
            movieEntity.setTitle("Movie_1");
            movieEntity.setCertification(CertificateType.A);
            movieEntity.setLanguage("ENG");
            movieEntity.setDuration(120);
            movieEntity.setStatus(MovieStatus.AVAILABLE);

            movieDao.addMovie(movieEntity);

            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
            ex.printStackTrace();
        }
    }

    public static void getMovieStatusTest(){
        try {
            MovieDaoImpl movieDao=new MovieDaoImpl();
            List<MovieEntity> movieByStatus = movieDao.getMovieByStatus(MovieStatus.AVAILABLE);
            for (MovieEntity movieEntity:movieByStatus) {
                System.out.println(movieEntity);
            }
            System.out.println("Test passed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void getMovieTitleTest(){
        try {
            MovieDaoImpl movieDao=new MovieDaoImpl();
            MovieEntity movieEntity = movieDao.getMovieByTitle("Movie_1");
            System.out.println(movieEntity);
            System.out.println("Test passed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
