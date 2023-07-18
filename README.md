# registration_login_springboot_security

To create a web application using Spring Boot for user registration and login with a MySQL database connection, you'll need to follow these steps:

Step 1: Set Up the Project

Open your preferred Integrated Development Environment (IDE) and create a new Spring Boot project.
Include the necessary dependencies in your pom.xml file:
-spring-boot-starter-web
-spring-boot-starter-data-jpa
-mysql-connector-java
-spring-boot-starter-security (for login functionality)
-spring-boot-starter-thymeleaf (for server-side rendering)


Step 2: Configure the Database

Open the application.properties file in your project and add the following configuration for the MySQL database connection

i.e
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/backendDemo
spring.datasource.username=root
spring.datasource.password=rushi
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
server.port =2000


Step 3: Create the User Entity

Create a new package, e.g.com.example.demo.Entity, and inside it, create a class called User.
Annotate the User class with @Entity and @Table to define it as a JPA entity.


Step 4: Create the User Repository

Create a new package e.g. com.example.demo.repository, and inside it, create an interface called UserRepository.
Extend the UserRepository interface from JpaRepository<User, Long>


Step 5: Create the User Registration and Login Controllers


Step 6: Create the Registration and Login HTML Templates

Create a new folder called templates inside the resources directory.
Inside the templates folder, create two HTML files: registration.html and login.html.
Design the registration and login forms using HTML and Thymeleaf tags. Include form fields for username and password inputs.
In the registration form, set the form action to the URL mapped by the RegistrationController.
In the login form, set the form action to the URL mapped by the LoginController.



Step 7: Run the Application

Build and run the Spring Boot application.
Open a web browser and access the registration page using http://localhost:2000/registration.
Register a new user by providing a username and password.
After registration, you should be redirected to the login page (http://localhost:8080/login).
Login with the registered credentials.



