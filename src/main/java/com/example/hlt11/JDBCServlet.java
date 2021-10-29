package com.example.hlt11;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "JDBCServlet", value = "/JDBC-servlet")
public class JDBCServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Get parameters from user via jsp
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String userPassword = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");


        // Create database connection variables
        String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sakila";
        String userName = "root";
        String databasePassword = "root";


        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, userName, databasePassword);
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO userInformation" +
                    "(userFirstName, userLastName, userEmail, userPassword)" +
                    "VALUES" +
                    "('"+firstName+"', '"+lastName+"', '"+email+"', '"+userPassword+"')");

            connection.close();
        }

        catch (Exception exception) {
            System.out.println("Database error: " + exception);
        }

    }

    public void destroy() {
    }
}
