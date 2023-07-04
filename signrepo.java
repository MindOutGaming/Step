/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhavesh.com.step.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Lenovo
 */
public class signrepo {
     
        String url ="jdbc:mysql://localhost:3306/step";
        String user ="root";
        String pass ="bhavesh2525";
        public  int insertData(String username,String email,String password) throws SQLException{
           
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement stm = con.prepareStatement("insert into employee values(?,?,?);");
            stm.setString(1, username);
            stm.setString(2, email);
            stm.setString(3, password);
           int status = stm.executeUpdate();
           if(status>0){
           System.out.println("done");
           }
           return status;
        }
}
