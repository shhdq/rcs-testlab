import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUpdate {


    public void update() {

        Scanner inputUpdate = new Scanner(System.in);

        System.out.println("Choose user \"id\" to update Username for: " );
        String userID = inputUpdate.nextLine();

        try (
                Connection conn = DriverManager.getConnection(***); //connection to be established later
                Statement stment = conn.createStatement()
        ) {

            String updateName = "UPDATE (\"users\") SET CustomerName WHERE id = '"+userID+"'";  //database still to be named

            stment.execute(updateName);

            System.out.println("Data updated");

        } catch(SQLException exception) {

            exception.printStackTrace();
        }
    }




















}
