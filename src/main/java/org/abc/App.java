package org.abc;

import com.mysql.jdbc.SQLError;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            Connection dbConn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "passwd");
            System.out.println("db connection: OK");
        }
        catch (SQLException e) {
            System.out.println("db connection: Failed");
        }
    }
}
