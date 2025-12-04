package com.jspiders.dao;

import com.jspiders.config.DbConfig;
import com.jspiders.entity.AuditoriumEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuditoriumDaoImpl implements AuditoriumDao{
    @Override
    public void addAuditorium(AuditoriumEntity auditoriumEntity) {
        System.out.println("Adding auditorium");
        Session session=DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        session.persist(auditoriumEntity);
        transaction.commit();
        session.close();
    }

    @Override
    public AuditoriumEntity getAuditorium(Long audiId) {
        System.out.println("Read the auditorium");
        Session session=DbConfig.getSession();
        Transaction transaction=session.beginTransaction();
        AuditoriumEntity auditoriumEntity=session.find(AuditoriumEntity.class,audiId);
        transaction.commit();
        session.close();
        return auditoriumEntity;
    }

    @Override
    public void updateAuditorium(Long audiId) {
        System.out.println("Update auditorium");
        Session session=DbConfig.getSession();
        session.close();
    }

    @Override
    public void deleteAuditorium(Long audiId) {
        System.out.println("delete auditorium");
        Session session=DbConfig.getSession();
        session.close();
    }
}
