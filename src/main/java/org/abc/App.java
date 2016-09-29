import java.sql.*;

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
