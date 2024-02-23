#Group 5: HR Backend Connection

# Employee and Department Backend Connection

This project implements a backend connection for the Employee and Department tables, as well as endpoints for the User resource. The endpoints are implemented using Spring Boot and provide CRUD operations for the User entity.

## Endpoints

The following endpoints are available for the User resource:

1. Add User (POST):
* Endpoint: /api/v1/users
* Request body: JSON representation of a user
* Example: 


   {
     'name': 'john',
     'phoneNumber': '9123117578',
     'email': 'john@gmail.com'
   }


2. Get User Details (GET):
* Endpoint: /api/v1/users/{id}
* Example: /api/v1/users/1

3. Update User (PUT):
* Endpoint: /api/v1/users/{id}
* Example: /api/v1/users/1
* Request body: Updated user details

4. Delete User (DELETE):
* Endpoint: /api/v1/users/{id}
* Example: /api/v1/users/1

## Logging

Logging is done to keep track of all the events happening in the backend. The logs are implemented using SLF4J and Logback.

## JwtFilter

JwtFilter provides authentication for the login system. It uses the jjwt library to create and verify JWT tokens.

## Swagger/OpenAPI

Swagger/OpenAPI is used for documentation of the API. The endpoints are documented using annotations and the Swagger UI provides an interactive interface for testing the API.

## Running the Application

To run the application, first clone the repository:


git clone https://github.com/username/project.git


Then, navigate to the project directory and run the following command:


mvn spring-boot:run


The application will start up and you can access the endpoints using a tool such as Postman. You can also access the Swagger UI by navigating to http://localhost:8080/swagger-ui/index.html in your web browser.

## Conclusion

This project provides a backend connection for the Employee and Department tables, as well as endpoints for the User resource. It also provides logging, authentication using JWT, and documentation using Swagger/OpenAPI. Feel free to customize the endpoints and functionality based on your needs.
has context menuParagraph
