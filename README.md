MELI Orders API

A REST API for creating and managing orders in an online store.
Built with Spring Boot 3 and Java 17, using H2 database for development.

📌 Description

This project allows you to:

Create new orders (POST /orders)

Retrieve all orders (GET /orders)

Retrieve a single order by ID (GET /orders/{id})

Update an order (PUT /orders/{id})

Delete an order (DELETE /orders/{id})

A Postman collection is included to easily test all endpoints.

🛠 Technologies

Java 17

Spring Boot 3

Spring Data JPA

H2 Database (development) / PostgreSQL (optional for production)

Springdoc OpenAPI (Swagger)

Maven

🚀 Running the Project
1. Clone the repository
git clone https://github.com/your-username/meli-orders.git
cd meli-orders

2. Build the project
mvn clean install

3. Run the application
mvn spring-boot:run


The application will run at http://localhost:8080

🗂 Available Endpoints

POST /orders → Create an order

GET /orders → Get all orders

GET /orders/{id} → Get order by ID

PUT /orders/{id} → Update an order

DELETE /orders/{id} → Delete an order

Test all endpoints using Postman by importing the collection:
MELI_Orders_Collection.json

⚡ POST Example

Request:

{
  "customerName": "Juan Pérez",
  "totalAmount": 1200.50,
  "orderDate": "2025-10-14T10:00:00"
}


Expected Response (201 Created):

{
  "id": 1,
  "customerName": "Juan Pérez",
  "totalAmount": 1200.50,
  "orderDate": "2025-10-14T10:00:00"
}

💡 Notes

H2 database is in-memory; data is lost when restarting the application.

To use PostgreSQL in production, configure the application.properties file with your server URL and credentials.
