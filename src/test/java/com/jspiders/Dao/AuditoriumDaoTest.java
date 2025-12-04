package com.jspiders.Dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.entity.AuditoriumEntity;

public class AuditoriumDaoTest {
    public static void main(String[] args) {
        addAuditorium();
    }

    public static void addAuditorium()
    {
        System.out.println("Testing ADD auditorium");
        try {
            AuditoriumDaoImpl auditoriumDao=new AuditoriumDaoImpl();

            AuditoriumEntity auditoriumEntity=new AuditoriumEntity();
            auditoriumEntity.setName("Audi_1");
            auditoriumEntity.setSeatCols(20);
            auditoriumEntity.setSeatRows(40);
            auditoriumDao.addAuditorium(auditoriumEntity);

            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
            ex.printStackTrace();
        }
    }
}
