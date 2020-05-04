package com.thanyani;

import java.sql.*;

public class ConnectionPostgresSQL  {

 static  public void dbConnection() throws SQLException {

  //Get a connection to a Database
  Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cohort20db",
          "postgres","password");

  //Create a Statement
  Statement statement = connection.createStatement();
  //Execute SQL query
  ResultSet resultSet = statement.executeQuery("select * from recruit");
  //Process the result set
  while (resultSet.next()){
   System.out.println(resultSet.getString("id")+","+resultSet.getString("full_name"));
  }

 }
}
