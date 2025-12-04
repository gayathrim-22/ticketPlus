package com.jspiders.dao;

import com.jspiders.config.DbConfig;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class MovieDaoImpl implements MovieDao{
    public void addMovie(MovieEntity movieEntity){
        System.out.println("adding movie");
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        session.persist(movieEntity);
        transaction.commit();
        session.close();
    }

    public MovieEntity getMovie(Long movieId){
        System.out.println("Finding Movie by id : "+movieId);
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        MovieEntity movieEntity=session.find(MovieEntity.class,movieId);
        transaction.commit();
        session.close();
        return movieEntity;
    }
    public void updateMovie(Long movieId){
        System.out.println("Successfully movie is updated");
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();

        transaction.commit();
        session.close();
    }
    public void deleteMovie(Long movieId){
        System.out.println("Successfully movie is deleted");
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();

        transaction.commit();
        session.close();
    }

    @Override
    public List<MovieEntity> getMovieByStatus(MovieStatus movieStatus) {
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        String hql="From MovieEntity m1 where m1.status=:status";
        Query<MovieEntity> query = session.createQuery(hql, MovieEntity.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Status");
        String status=sc.next();
        query.setParameter("status",MovieStatus.valueOf(status));
        List<MovieEntity> resultList = query.getResultList();

        transaction.commit();
        session.close();

        return resultList;
    }

    @Override
    public MovieEntity getMovieByTitle(String title) {
        Session session = DbConfig.getSession();

        String hql="From MovieEntity m1 where m1.title=:title";
        Query<MovieEntity> query = session.createQuery(hql, MovieEntity.class);
        query.setParameter("title",title);
        Transaction transaction=session.beginTransaction();
        MovieEntity movieEntity = query.uniqueResult();

        transaction.commit();
        session.close();
        return movieEntity;
    }
}
