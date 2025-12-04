package com.jspiders.service;

import com.jspiders.users.AdminServiceImpl;

public class AdminServiceTest {
    public static void main(String[] args) {
        createMovieTest();
    }
    public static void createMovieTest(){
        System.out.println("Testing add movie");
        try {
            AdminServiceImpl adminService =new AdminServiceImpl();
            adminService.createMovie();
            System.out.println("✅ Admin - create movie test passed");
        } catch (Exception e) {
            System.err.println("❌ Admin- create movie test failed");
        }
    }
}
