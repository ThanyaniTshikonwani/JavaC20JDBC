package com.thanyani;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        ConnectionPostgresSQL.dbConnection();
        System.out.println(" ");
        InsertingData.insertingData();
        ConnectionPostgresSQL.dbConnection();
        System.out.println(" ");
        UpdateData.updatingData();
        ConnectionPostgresSQL.dbConnection();
        System.out.println(" ");
        DeleteData.deletingData();
        ConnectionPostgresSQL.dbConnection();
        System.out.println(" ");
        ConnectionPostgresSQL.dbConnection();
  }
}
