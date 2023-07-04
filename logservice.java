/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhavesh.com.step.service;

import bhavesh.com.step.repository.loginRepo;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class logservice {
    public static int verfylogin(String username,String password) throws SQLException{
            loginRepo lr = new loginRepo(); 
    return lr.check(username,password);
    }
}
