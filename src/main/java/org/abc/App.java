//package org.abc;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
//import com.mysql.jdbc.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.ResultSet;
import java.sql.*;

//import java.util.Properties;
//import java.util.HashMap;
//import java.util.Map;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection dbConn = null;
        System.out.println( "Hello World!" );

        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backup", "rootuser", "passw0rd");
            System.out.println("db connection: OK");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        if (dbConn != null) {
            System.out.println("closing db");
            try {
                dbConn.close();
                dbConn = null;
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
