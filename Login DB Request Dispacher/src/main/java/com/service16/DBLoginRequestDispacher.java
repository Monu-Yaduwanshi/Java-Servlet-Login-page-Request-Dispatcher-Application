package com.service16;

import java.io.*;
import java.sql.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DBLoginRequestDispacher")
public class DBLoginRequestDispacher extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/loginrequestdispacher";
    private static final String JDBC_USER ="root";
    private static final String JDBC_PASSWORD = "root";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String u = request.getParameter("username");
        String p = request.getParameter("password");

        if (authenticateUser(u, p)) {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeRequest");
            rd.forward(request, response);
        } else {
            out.print("Sorry, incorrect username or password!");
            RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
            rd.include(request, response);
        }
    }

    private boolean authenticateUser(String username, String password) {
        boolean isValidUser = false;
        try (Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement ps = con.prepareStatement("SELECT * FROM logindata WHERE username = ? AND password = ?")) {

            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    isValidUser = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValidUser;
    }
}
