package src;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;

public class DBUpdate {


    public void update() {

        Scanner inputSc = new Scanner(System.in);

        System.out.println("Choose user \"id\" to update Username for: " );
        int userID = inputSc.nextInt();
        System.out.println("Write \"CustomerName\" to update : " );
        String customerName = inputSc.next();

        try (
//                Connection conn = DriverManager.getConnection(***, ***, ***);   //connection to be established later
                Statement stment = conn.createStatement()
        ) {

            String updateName = "UPDATE (***) SET CustomerName ='"+customerName+"' WHERE id = '"+userID+"'";  // (***) -=database still to be named

            stment.execute(updateName);

            System.out.println("Data updated");

        } catch(SQLException exception) {

            exception.printStackTrace();
        }
    }


















}
