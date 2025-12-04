package com.jspiders.users;

import com.jspiders.dto.MovieDto;
import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;
import com.jspiders.service.MovieServiceImpl;

import java.util.Scanner;

public class AdminServiceImpl implements AdminService{
    @Override
    public void createMovie() {
        System.out.println("Testing ADD Movie");

        try {
            MovieServiceImpl movieService = new MovieServiceImpl();
            Scanner sc=new Scanner(System.in);
            MovieDto movieDto=new MovieDto();

            System.out.println("Enter Movie Title");
            String title=sc.next();
            movieDto.setTitle("Movie_2");

            System.out.println("Enter Certificate Type");
            String certification =sc.next();
            movieDto.setCertification(CertificateType.valueOf(certification));

            System.out.println("Enter Language");
            String language=sc.next();
            movieDto.setLanguage("Tel");

            System.out.println("Enter duration");
            Integer duration=sc.nextInt();
            movieDto.setDuration(130);

            movieDto.setStatus(MovieStatus.AVAILABLE);

            movieDto.setCreatedBy(30l);

            System.out.println();
            System.out.println("==========   verify movie details   ================");
            System.out.println(movieDto);
            System.out.println("==========   verify movie details   ================");
            System.out.println();

//            movieService.addMovie(movieDto);

            System.out.println("✅Movie Added Successfully");
        }
        catch (Exception ex) {
            System.err.println("❌Error!! While creating Movie");
            ex.printStackTrace();
        }
    }
}
