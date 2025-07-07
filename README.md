TaskaAPI
TaskaAPI is a RESTful API built with Java, Spring Boot, and the in-memory H2 database. It provides full CRUD operations (Create, Read, Update, Delete) for task management, ideal for integration with front-end applications, mobile apps, or internal tools.

Technologies Used
Java 17

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Maven

Features
Create new tasks

Retrieve all tasks or a task by ID

Update task information

Delete tasks

Basic data validation

Project Structure
taskaapi/
├── src/
│ ├── main/
│ │ ├── java/com/example/taskaapi/
│ │ │ ├── controller/ → REST Controllers
│ │ │ ├── model/ → Domain models
│ │ │ ├── repository/ → Spring Data JPA Repositories
│ │ │ └── TaskapiApplication → Main Spring Boot class
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── (unit tests)
├── pom.xml
└── README.md

Configuration
The project uses H2 as an in-memory database for development.
The H2 console is enabled and accessible at:

http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave empty)

API Endpoints
Method: GET
Endpoint: /tasks
Description: Get all tasks

Method: GET
Endpoint: /tasks/{id}
Description: Get a task by ID

Method: POST
Endpoint: /tasks
Description: Create a new task

Method: PUT
Endpoint: /tasks/{id}
Description: Update an existing task

Method: DELETE
Endpoint: /tasks/{id}
Description: Delete a task

How to Run the Project
Clone the repository:
git clone https://github.com/dignaciovicente/taskaapi.git

Navigate to the project folder:
cd taskaapi

Run the application using Maven:
./mvnw spring-boot:run

Or run TaskapiApplication.java directly from your IDE.

Testing (Optional)
You can include unit and integration tests under src/test/java, such as:

Controller tests

Repository tests

Application context load test

Possible Future Improvements
Add authentication with Spring Security

Use PostgreSQL or MySQL for persistence

Add Swagger/OpenAPI documentation

Implement pagination and filtering

Create a Docker image

License
This project is open for educational and development purposes.

Author
Name: Ignacio Vicente del Rosal Hernández
Email: dignaciovicente@gmail.com
GitHub: https://github.com/dignaciovicente
