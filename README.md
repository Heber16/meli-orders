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

<img width="1314" height="634" alt="Captura de pantalla 2025-10-20 104502" src="https://github.com/user-attachments/assets/0920634d-2f6f-444d-9773-eb195da0f18a" />

<img width="1322" height="494" alt="Captura de pantalla 2025-10-20 104524" src="https://github.com/user-attachments/assets/cda38ce1-8e27-494c-93bc-df3e56f9a786" />

<img width="1307" height="519" alt="Captura de pantalla 2025-10-20 104541" src="https://github.com/user-attachments/assets/a5c43586-02c4-408d-a1c9-db6769997a03" />

<img width="1363" height="623" alt="Captura de pantalla 2025-10-20 111313" src="https://github.com/user-attachments/assets/27d70c93-6068-4f6e-8ebd-d27db9279057" />

<img width="1325" height="562" alt="Captura de pantalla 2025-10-20 111559" src="https://github.com/user-attachments/assets/959670c4-51e9-443b-b572-db785bf364da" />

<img width="1316" height="321" alt="Captura de pantalla 2025-10-20 111613" src="https://github.com/user-attachments/assets/8dac2670-044c-4383-87fd-4e3174bdd353" />

<img width="1330" height="604" alt="Captura de pantalla 2025-10-20 112819" src="https://github.com/user-attachments/assets/5bbaf469-39fa-4a89-97f5-f9d3493d86b2" />

<img width="1324" height="564" alt="Captura de pantalla 2025-10-20 112851" src="https://github.com/user-attachments/assets/dd46b67e-ba2a-4583-8b1b-f65b5dffecc4" />

<img width="1325" height="560" alt="Captura de pantalla 2025-10-20 112920" src="https://github.com/user-attachments/assets/83903a95-5f25-45a2-8a93-99e776c147f2" />

<img width="1304" height="599" alt="Captura de pantalla 2025-10-20 113130" src="https://github.com/user-attachments/assets/b9e5c466-4bf5-4642-bea9-5dec17b98422" />

<img width="1338" height="620" alt="Captura de pantalla 2025-10-20 113248" src="https://github.com/user-attachments/assets/ab937c76-13f8-46ab-bbfe-65febb0d0ff0" />
