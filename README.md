# User-Hub API

A simple Spring Boot REST API to manage users using MySQL as the database.

## 🚀 Features
- Add User (POST `/users`)
- Get All Users (GET `/users`)
- Get User by ID (GET `/users/{id}`)

## 🛠 Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (for testing)

## 🧾 Requirements
- Java 17 or later
- MySQL installed and running
- IDE (IntelliJ, VS Code, etc.)


# ```properties

# === MySQL DB Configuration (in `application.properties`) ===
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=root

# === JPA Configuration (in `application.properties`) ===
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
