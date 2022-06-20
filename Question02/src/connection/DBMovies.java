package connection;
import movies.Main;

import java.sql.*;

public class DBMovies {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String jdbcURL = "jdbc:mysql://localhost/Products?useTimezone=true&serverTimezone=UTC";
        String username = "root";
        String password = "diPakk55%";

        Connection connection = DriverManager.getConnection(jdbcURL, username, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet;
        PreparedStatement st;

    }
}
