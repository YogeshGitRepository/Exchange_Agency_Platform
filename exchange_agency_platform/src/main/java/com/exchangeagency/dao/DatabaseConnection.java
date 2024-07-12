package com.exchangeagency.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:c:/Users/olawale/Desktop/Exchange_Agency_Platform/exchange_agency_platform/exchangeagency.db";
    private static Connection connection = null;

    public static Connection getConnection() {
        File dbFile = new File(URL.replace("jdbc:sqlite:", ""));
        if (!dbFile.exists()) {
            System.err.println("Database file does not exist: " + dbFile.getAbsolutePath());
            return null;
        }

        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(URL);
                if (connection != null) {
                    System.out.println("Database connection established.");
                } else {
                    System.err.println("Failed to establish database connection.");
                }
            }
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: SQLite JDBC driver not found.");
            e.printStackTrace();
        }
        return connection;
    }
}
