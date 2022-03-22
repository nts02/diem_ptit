/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Son
 */
public class SinhVien {   
    private int id;
    private String maSV;
    private String ten;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, String username, String password, String email, String phone, String address) {
        this.maSV = maSV;
        this.ten = ten;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public SinhVien(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SinhVien(String maSV, String ten, String username, String password) {
        this.maSV = maSV;
        this.ten = ten;
        this.username = username;
        this.password = password;
    }
    
    
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }    

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", maSV=" + maSV + ", ten=" + ten + ", username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", address=" + address + '}';
    }
}


