/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Son
 */
public class DBcontext {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/ql_diem_ptit";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,username,password);
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(new DBcontext().getConnection());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
