# Java-Servlet-Login-page-Request-Dispatcher-Application
This project is a login application built with Java Servlets, MySQL database, and Apache Tomcat server. It demonstrates user authentication by validating login credentials and redirecting users to a welcome page upon successful login.

Features
User Authentication: Users can log in with their username and password.
Database Connectivity: Connects to a MySQL database to verify user credentials using prepared statements for security.
Request Dispatching: Utilizes request dispatching to redirect users based on authentication results.
Error Handling: Displays error messages for incorrect credentials and ensures user-friendly navigation.
Technologies Used
Java Servlet API
MySQL Database
Apache Tomcat Server
HTML/CSS for frontend
Setup Instructions
Clone the repository:

bash
Copy code
git clone <repository-url>
Configure the MySQL Database:

Create a database named loginrequestdispacher.
Create a logindata table with username and password columns.
Populate the table with sample user data.
Deploy on Apache Tomcat:

Import the project into your Eclipse IDE.
Configure the Tomcat server in Eclipse.
Run the application on the Tomcat server.
Access the application:

Navigate to http://localhost:8080/your-context-path/Login.html to access the login page.
