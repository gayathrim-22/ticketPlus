package com.jspiders.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DbConfig {
    private static SessionFactory sessionFactory;
    static {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("✅Loading Configuration");
        sessionFactory=configuration.buildSessionFactory();
        System.out.println("✅Build Session Factory");
    }

    public static Session getSession(){
        Session session=sessionFactory.openSession();
        System.out.println("🔓Session opened");
        return session;
    }
    public static void shutdown(){
        sessionFactory.close();
        System.out.println("🔒session Factory closed");
    }
}
