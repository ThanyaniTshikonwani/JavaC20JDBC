package com.thanyani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    static  public void deletingData() throws SQLException {
        //Get a connection to a Database
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cohort20db",
                "postgres", "password");


        //Create a Statement or Prepared
        Statement statement = connection.createStatement();

        //Executing Queries
        String sql = "delete from recruit where id=1";
        statement.executeUpdate(sql);
        System.out.println("Deleting Data Complete!!");
    }
}
