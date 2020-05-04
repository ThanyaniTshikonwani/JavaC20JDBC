package com.thanyani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingData  {

    static public void insertingData() throws SQLException {
        //Get a connection to a Database
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cohort20db",
                "postgres", "password");


        //Create a Statement
        Statement statement = connection.createStatement();

        //Executing Queries

        String sql = "insert into recruit (id,full_name) values (1,'Lufuno M')";
        statement.executeUpdate(sql);
        System.out.println("inserting data complete");

    }
}
