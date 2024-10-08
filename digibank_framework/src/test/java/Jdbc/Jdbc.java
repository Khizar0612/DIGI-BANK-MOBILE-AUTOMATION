package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

    private static final String url = "jdbc:postgresql://192.168.0.196:5432/mydatabase";
    private static final String user = "postgres";
    private static final String password = "mysecretpassword";

    public static String JdbcConnection() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String otp = null;

        try {
            // Establish a connection
            connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            statement = connection.createStatement();

            // Define the SQL query
            String sql = "SELECT email_otp FROM otp ORDER BY id DESC LIMIT 1";

            // Execute the query
            resultSet = statement.executeQuery(sql);

            // Process the results
            if (resultSet.next()) {
                otp = resultSet.getString("email_otp");
            } else {
                System.out.println("No OTP found in the database.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return otp;
    }
}
