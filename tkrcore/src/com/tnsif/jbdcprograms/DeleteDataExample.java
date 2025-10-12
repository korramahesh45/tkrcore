package com.tnsif.jbdcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/new";
        String username = "root";
        String password = "1234";

        try {
            // Step 1: Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Step 2: Create statement
            Statement stmt = con.createStatement();

            // Step 3: Execute delete query
            String query = "DELETE FROM students WHERE id = 1";
            int rowsAffected = stmt.executeUpdate(query);

            System.out.println(rowsAffected + " record(s) deleted successfully.");

            // Step 4: Close connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
