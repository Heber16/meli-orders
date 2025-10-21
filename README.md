## Sprint 3: API Documentation and Testing
📘 Overview

During Sprint 3, the main goal was to document and validate the API developed in the previous stages.
This was achieved by integrating OpenAPI (Swagger) to generate an interactive and easy-to-understand documentation interface, and by creating a set of tests to ensure the API’s correct functionality.

⚙️ Key Implementations

Swagger Integration

Added Swagger configuration using springdoc-openapi dependency.

Configured a base description, version, and contact details through swagger-config.yaml.

Enabled access to the Swagger UI via:

http://localhost:8080/swagger-ui/index.html


The API documentation includes all main endpoints such as:

GET /api/orders

POST /api/orders

GET /api/orders/{id}

DELETE /api/orders/{id}

API Documentation Features

Each endpoint includes:

A clear summary and description.

Request parameters and response examples.

HTTP response codes (200, 400, 404, 500).

The complete OpenAPI specification is also available at:

http://localhost:8080/v3/api-docs


Testing and Validation

Conducted functional tests directly from Swagger UI using the “Try it out” feature.

Verified that all requests return the correct status codes and JSON structures.

Confirmed that all endpoints are fully functional and aligned with their intended behavior.

🧩 Project Structure
src/
 ├─ main/
 │   ├─ java/com/example/orders
 │   │   ├─ controller/
 │   │   ├─ model/
 │   │   └─ service/
 │   └─ resources/
 │       ├─ application.yml
 │       └─ swagger-config.yaml
 └─ test/
     └─ java/com/example/orders/
         └─ OrderControllerTest.java

🚀 How to Access Swagger Documentation

Run the Spring Boot application:

mvn spring-boot:run


Open your browser and go to:

http://localhost:8080/swagger-ui/index.html

Explore the API endpoints and test them interactively.

<img width="1326" height="595" alt="Captura de pantalla 2025-10-20 104444" src="https://github.com/user-attachments/assets/81c0ac23-1c5c-4af9-a827-9463d3bb20d8" />
