/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhavesh.com.step.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class studentrepo {
    String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
    public ResultSet getstudent() throws SQLException{
      Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement stm = con.prepareStatement("select name,address,email,state,city from students;");
           
            ResultSet rs = stm.executeQuery();  
            return rs;
    }
    
     public static int insertStudent(String name, 
            String address, 
            String email, 
            String state, 
            String city) throws SQLException {
         String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
        Connection con = DriverManager.getConnection(url, user, pass);
        // insert statement
        PreparedStatement stmt = con.prepareStatement(
                "insert into students (name, address, email, state, city) values (?, ?, ?, ?, ?);");

        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, email);
        stmt.setString(4, state);
        stmt.setString(5, city);
        
        return stmt.executeUpdate();
    }
     public  static int deleteds(String email) throws SQLException{
          String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
        Connection con = DriverManager.getConnection(url, user, pass);
         PreparedStatement stmt = con.prepareStatement("delete from students where email=?;");

        stmt.setString(1, email);
        return stmt.executeUpdate(); 
     }
    
      public static int updatestu(String name, 
            String address, 
            String state, 
            String city,
            String email) throws SQLException {
         String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
        Connection con = DriverManager.getConnection(url, user, pass);
        // insert statement
        PreparedStatement stmt = con.prepareStatement(
                "update students set name = ?,address=?,state=?,city=? where email=?;");

        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, state);
        stmt.setString(4, city);
        stmt.setString(5, email);
        
        return stmt.executeUpdate();
    }
      
      public ResultSet searchstudent(String email) throws SQLException{
      Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement stm = con.prepareStatement("select name,address,email,state,city from students where email =?;");
                   stm.setString(1, email);
            ResultSet rs = stm.executeQuery();  
            return rs;
    }
}
