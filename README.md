# Java Servlet Login Page Request Dispatcher Application

Welcome to the **Java Servlet Login Page Request Dispatcher Application**! 🚀 This project demonstrates a simple yet powerful login mechanism built using Java Servlets, a MySQL database, and Apache Tomcat. The application authenticates user credentials and redirects users based on the login result using Java Servlet request dispatching techniques. It's an excellent example of handling user authentication in web applications with secure database connectivity.

## Features

- **User Authentication**: Securely validate user credentials by querying a MySQL database.
- **Database Connectivity**: Leverages MySQL database for storing and verifying login details, using **Prepared Statements** for secure queries and to prevent SQL Injection.
- **Request Dispatching**: Implements servlet-based request dispatching to redirect users to the appropriate page (welcome or error) based on login results.
- **Error Handling**: Friendly error messages are displayed when login credentials are incorrect, ensuring a smooth and user-friendly experience.

## Technologies Used

- **Java Servlet API**: For handling HTTP requests, managing sessions, and dispatching requests.
- **MySQL Database**: For storing user login credentials securely.
- **Apache Tomcat Server**: The servlet container that hosts the web application.
- **HTML/CSS**: For a simple, clean, and responsive user interface.

## Setup Instructions

### 1. Clone the Repository

```bash
git clone <repository-url>
 Configure the MySQL Database
Create a Database:

Create a new MySQL database named loginrequestdispacher.
Create a Table:

Create a table named logindata with the following columns:
username (VARCHAR)
password (VARCHAR)
Populate the Table:

Insert sample data into the logindata table for testing purposes.
3. Deploy on Apache Tomcat
Import the Project into Eclipse IDE:

Open Eclipse IDE and select File > Import > Existing Projects into Workspace.
Browse to the directory where the project was cloned and import it.
Configure Apache Tomcat Server:

In Eclipse, configure the Apache Tomcat server by right-clicking the project and selecting Properties > Targeted Runtimes.
Choose Apache Tomcat from the list and apply the changes.
Run the Application:

Right-click on the project in Eclipse, select Run As > Run on Server.
Choose Apache Tomcat and start the server.
4. Access the Application
Open your web browser and navigate to:
````
http://localhost:8080/your-context-path/Login.html
Enter the login credentials that match the data in the logindata table to authenticate.
Author
Monu Yaduwanshi - GitHub Profile 🌐

Notes
This application uses hardcoded credentials for demonstration purposes. It can be extended to allow user registration and secure login with password encryption.
To enhance security, consider integrating additional authentication measures like HTTPS and secure password hashing.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Additional Resources
Java Servlets Documentation
MySQL Documentation
Apache Tomcat Documentation
Eclipse IDE
Happy Coding! 💻✨
