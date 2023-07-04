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
public class loginRepo {
    String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
   
public int check(String username,String password) throws SQLException{
    
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement stm = con.prepareStatement("select count(username) from employee where username = ? and password = ?;");
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            int status = 0;
            if(rs.next()){
            status = rs.getInt(1);
            }
            return status;
}
   
}
