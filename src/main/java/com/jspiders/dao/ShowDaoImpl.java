package com.jspiders.dao;

import com.jspiders.config.DbConfig;
import com.jspiders.entity.ShowEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShowDaoImpl implements ShowDao{
    @Override
    public void addShow(ShowEntity showEntity) {
        System.out.println("Adding show ");
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        session.persist(showEntity);
        transaction.commit();
        session.close();
    }

    @Override
    public ShowEntity getShow(Long showId) {
        System.out.println("Finding Show");
        Session session = DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        ShowEntity showEntity=session.find(ShowEntity.class,showId);
        transaction.commit();
        session.close();
        return showEntity;
    }

    @Override
    public void updateShow(Long showId) {
        System.out.println("Successfully show is updated");
        Session session = DbConfig.getSession();
        session.close();
    }

    @Override
    public void deleteShow(Long showId) {
        System.out.println("Successfully show is deleted");
        Session session = DbConfig.getSession();
        session.close();
    }
}
