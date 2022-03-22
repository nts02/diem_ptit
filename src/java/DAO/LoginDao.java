/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.SinhVien;

/**
 *
 * @author Son
 */
public class LoginDao {
    Connection conn = null ;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public SinhVien checkLogin(String user , String pass) {
        
        try {
            String query = "select maSV, ten, username, password from tblsinhvien where username = ? and password = ?";
            conn = new DBcontext().getConnection();
            ps  = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if(rs.next()) {
                SinhVien sv = new SinhVien(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4));
                return sv ;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return null;
        
    }
}
