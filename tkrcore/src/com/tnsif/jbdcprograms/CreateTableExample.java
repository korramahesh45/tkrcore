package com.tnsif.jbdcprograms;

import java.beans.Statement;
import java.sql.*;
import javax.sql.*;


public class CreateTableExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connectio
            n con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/new", "root", "1234");

            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE childrens (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "age INT)";
            stmt.executeUpdate(sql);

            System.out.println("✅ Table Created Successfully!");
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}