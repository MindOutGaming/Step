/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhavesh.com.step.service;

import bhavesh.com.step.repository.studentrepo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public  class processStudentservice {
    public static ResultSet getallstudent() throws SQLException{
            studentrepo sr = new studentrepo();
        return sr.getstudent();
    }
   public static int insertstudent(String name, 
            String address, 
            String email, 
            String state, 
            String city) throws SQLException{
   return studentrepo.insertStudent(name,address,email,state,city);
       
   }
   public static int deletedst(String email) throws SQLException{
       return studentrepo.deleteds(email);
   }
   
   public static int updatestudent(String name, 
            String address, 
            String state, 
            String city, 
            String email) throws SQLException{
   return studentrepo.updatestu(name,address,state,city,email);
       
   }
   
    public static ResultSet searchstudents(String email) throws SQLException{
            studentrepo sr = new studentrepo();
        return sr.searchstudent(email);
    }
}
