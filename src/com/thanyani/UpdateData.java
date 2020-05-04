package com.thanyani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    static  public  void updatingData() throws SQLException {
        //Get a connection to a Database
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cohort20db",
                "postgres", "password");


        //Create a Statement
        Statement statement = connection.createStatement();

        //Executing Update Statement Queries
        String sql = "update recruit set full_name ='Boitumelo M' where id=1";
        statement.executeUpdate(sql);
        System.out.println("Updating Data Complete!!");
    }
}
