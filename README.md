# MELI Orders API – Sprint 2

## Overview

This project is part of the MELI Orders API developed under a multi-stage process.  
The second sprint focuses on configuring **environment profiles** and **system variables** to prepare the project for deployment in different environments.

---

## 🌱 Environment Profiles

Three profiles were created to support separate configurations for each stage of the development cycle:

- **Development (`application-dev.yml`)**
  - Uses the local H2 database for testing and debugging.
  - Enables detailed logging and Swagger UI for API documentation.
- **Testing (`application-test.yml`)**
  - Uses a test database configuration for integration testing.
  - Includes limited logging to improve performance during test runs.
- **Production (`application-prod.yml`)**
  - Uses environment variables for sensitive data such as database credentials.
  - Disables Swagger UI and debug logs for security.

---

## ⚙️ How to Switch Profiles

To run the project with a specific profile, set the `spring.profiles.active` property.

### Example (in IntelliJ or command line):

# Development
mvn spring-boot:run -Dspring-boot.run.profiles=dev

# Testing
mvn spring-boot:run -Dspring-boot.run.profiles=test

# Production
mvn spring-boot:run -Dspring-boot.run.profiles=prod

