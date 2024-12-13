import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load the driver (not required for newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/library";
            String username = "root";
            String password = "1234";

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

        } catch (ClassNotFoundException e) {
            System.out.println("Database driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
        return connection;
    }
}
