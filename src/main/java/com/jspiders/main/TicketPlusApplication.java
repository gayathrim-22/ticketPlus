package com.jspiders.main;

import com.jspiders.users.AdminServiceImpl;

import java.util.Scanner;

public class TicketPlusApplication {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("===============   Welcome to TICKETPLUS   =====================");
        System.out.println("Select User type");
        System.out.println("1.Admin \n"+"2.Customer \n"+"Any key for Exit /n"  );
        Integer user=sc.nextInt();
        switch (user){
            case 1:
                AdminServiceImpl adminService=new AdminServiceImpl();
                System.out.println("ADMIN");
                System.out.println("1.ADD MOVIE \n"+ "2.CREATE SHOW \n"+"Any key for Exit \n");
                Integer adminOptns=sc.nextInt();
                switch (adminOptns){
                    case 1: System.out.println("Add Movie");
                            adminService.createMovie();
                        break;
                    case 2:
                        System.out.println("Add Show");
                        break;
                    default:System.exit(0);
                }

                break;
            case 2:
                System.out.println("CUSTOMER");
            default:System.exit(0);
        }
        System.out.println("=========     THANKS VISIT AGAIN    =============");
    }
}