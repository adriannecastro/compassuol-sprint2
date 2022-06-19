import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String jdbcURL = "jdbc:mysql://localhost/Products?useTimezone=true&serverTimezone=UTC";
        String username = "root";
        String password = "diPakk55%";

        Connection connection = DriverManager.getConnection(jdbcURL, username, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet;
        PreparedStatement st;

        String query = "";
        int id, quantity, choice;
        String name, description;
        double price;

        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        while(true) {
            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>> Menu <<<<<<<<<<<<<<<<<<<<<<<\n");
            System.out.print("|---------------------------------------------------|\n");
            System.out.print("| Option [1] - Register products                    |\n");
            System.out.print("| Option [2] - Update the first registered product  |\n");
            System.out.print("| Option [3] - Delete the second registered product |\n");
            System.out.print("| Option [0] - Exit                                 |\n");
            System.out.print("|---------------------------------------------------|\n");
            System.out.print("Enter an option: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Register products");

                    System.out.println("Name: ");
                    name = str.nextLine();

                    System.out.println("Description: ");
                    description = str.nextLine();

                    System.out.println("Quantity: ");
                    quantity = in.nextInt();

                    System.out.println("Price: ");
                    price = in.nextDouble();

                    query = "INSERT INTO tbProducts (NAME, DESCRIPTION, QUANTITY, PRICE) VALUES(?, ?, ?, ?)";
                    st = connection.prepareStatement(query);
                    st.setString(1, name);
                    st.setString(2, description);
                    st.setInt(3, quantity);
                    st.setDouble(4, price);

                    st.executeUpdate();
                    System.out.println("Products registered successfully");

                    break;

                case 2:
                    System.out.println("2. Update the first registered product");

                    System.out.println("ID: ");
                    id = in.nextInt();

                    System.out.println("Name: ");
                    name = str.nextLine();

                    System.out.println("Description: ");
                    description = str.nextLine();

                    System.out.println("Quantity: ");
                    quantity = in.nextInt();

                    System.out.println("Price: ");
                    price = in.nextDouble();

                    query = "UPDATE tbProducts SET NAME=?, DESCRIPTION=?, QUANTITY=?, PRICE=? WHERE ID = 1";
                    st = connection.prepareStatement(query);
                    st.setString(1, name);
                    st.setString(2, description);
                    st.setInt(3, quantity);
                    st.setDouble(4, price);

                    st.executeUpdate();
                    System.out.println("First products updated successfully");

                    break;

                case 3:
                    System.out.println("3. Delete the second registered product");

                    System.out.println("ID: ");
                    id = in.nextInt();

                    query = "DELETE FROM tbProducts WHERE ID = ?";
                    st = connection.prepareStatement(query);
                    st.setInt(1, id);

                    st.executeUpdate();
                    System.out.println("Second product deleted successfully");

                case 4:
                    System.out.println("4. All Products");
                    query = "SELECT ID, NAME, DESCRIPTION, QUANTITY, PRICE FROM tbProducts";
                    resultSet = statement.executeQuery(query);
                    while(resultSet.next())
                    {
                        id= resultSet.getInt("ID");
                        name = resultSet.getString("NAME");
                        description = resultSet.getString("DESCRIPTION");
                        quantity = resultSet.getInt("QUANTITY");
                        price = resultSet.getDouble("PRICE");

                        System.out.print(id + " ");
                        System.out.print(name + " ");
                        System.out.print(description + " ");
                        System.out.println(quantity + " ");
                        System.out.println(price + " ");
                    }
                    break;

                case 0:
                    System.out.println("Application finished");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid selection");
                    break;

            }


        }

    }


}
