package com.service16;

import java.io.*;  

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
  
public class DBWelcomeRequestDispacher extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String u = request.getParameter("username");
    out.print("Welcome! "+u  );
    out.print("<br>Your login credential are correct<br>"); 
    out.print("<b><a href='Login.html'>Home page</b></a>");
    }  
  
}  
