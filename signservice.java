/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bhavesh.com.step.service;

import bhavesh.com.step.repository.signrepo;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class signservice {
public  static int insertVlaue(String username,String email,String password) throws SQLException{
        signrepo sr = new signrepo();

    return sr.insertData(username, email, password);
}
}
