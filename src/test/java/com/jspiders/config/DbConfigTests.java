package com.jspiders.config;

import org.hibernate.Session;

public class DbConfigTests {
    public static void main(String[] args) {
        testDbConnection();
    }

    public static void testDbConnection(){
        System.out.println("Testing DB Connection");
        try{
            Session session=DbConfig.getSession();
            session.close();
            DbConfig.shutdown();
            System.out.println("✅ Test DB Passed");
        } catch (Exception e) {
            System.out.println("❌ Test DB Failed");
        }
    }
}
