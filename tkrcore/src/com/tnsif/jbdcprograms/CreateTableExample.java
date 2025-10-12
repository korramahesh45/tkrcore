package com.tnsif.jbdcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTableExample {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/new", "root", "1234");

            // Create Statement
            Statement stmt = con.createStatement();

            // Create Table Query
            String sql = "CREATE TABLE students (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "age INT)";
            stmt.executeUpdate(sql);

            System.out.println("✅ Table Created Successfully!");
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ SQL Error!");
            e.printStackTrace();
        }
    }
}
