package org.gremlin.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPoint {
    private static Properties properties;

    private static Connection conn;

    private final static String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=grem";
    private final static String user = "postgres";
    private final static String password = "1234!";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=grem","postgres","1234!");
        return conn;

    }

}
