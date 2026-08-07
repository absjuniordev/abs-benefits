# ABS Benefits API

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![Status](https://img.shields.io/badge/status-in%20development-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)

> Modern employee benefits management API built with Java and Spring Boot, focused on clean architecture, security, and scalable backend development.

---

# 🚀 About the Project

**ABS Benefits** is a backend application designed to manage flexible employee benefits in a secure, organized, and scalable way.

The project is part of the **ABS — Application Backend Solutions** portfolio and demonstrates enterprise backend development practices using Java and Spring Boot.

Current focus:

- RESTful APIs
- JWT Authentication & Authorization
- Domain-driven modeling
- Employee benefits management
- Benefits wallet management
- Layered architecture
- Clean Code principles
- Scalable backend design

Although it started as a learning project, ABS Benefits is continuously evolving into a production-inspired enterprise application.

---

# 🧠 Domain Overview

The system is based on a real-world employee benefits management platform.

## Main Entities

- User
- Enterprise
- Employee
- Benefit
- Benefit Wallet
- Wallet Transaction

## Business Rules

- An enterprise can have multiple employees.
- Each employee owns a benefits wallet.
- Wallet balances can be credited and debited.
- Benefits are configurable per company.
- Every wallet transaction is auditable.
- Access is protected through JWT authentication.

---

# 🛠️ Technologies

## Backend

- Java 17
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- Maven

## Database

- PostgreSQL

## Infrastructure

- Docker
- Docker Compose

## Documentation

- Swagger / OpenAPI

## Testing

- JUnit 5
- MockMvc

---

# 📐 Architecture

The project follows a feature-based architecture, organizing the application around business domains instead of technical layers.

## Main Principles

- Feature-oriented organization
- Domain isolation
- Separation of responsibilities
- Scalable architecture
- Clean Code
- SOLID principles

## Project Structure

```text
com.absjrdev.absbenefits
│
├── config
├── common
│
├── user
│   ├── api
│   ├── application
│   ├── domain
│   ├── dto
│   └── repository
│
├── enterprise
├── employee
├── benefit
├── benefitswallet
│
└── AbsBenefitsApplication.java
```

---

# 📦 Features

## Current Features

- JWT Authentication & Authorization
- User management
- Enterprise management
- Employee management
- Benefit management
- Benefits wallet management
- Wallet transactions
- Reports
- RESTful API endpoints

---

# 🔮 Roadmap

Planned improvements include:

- PostgreSQL integration
- Spring Data JPA
- Hibernate
- Docker
- Docker Compose
- CI/CD with GitHub Actions
- Cloud deployment
- Kafka integration
- Email notifications
- Metrics & Observability
- Unit and integration tests

---

# 📚 Learning Goals

This project was developed to strengthen practical knowledge in:

- Spring Boot
- Spring Security
- JWT Authentication
- RESTful API development
- Enterprise backend architecture
- Relational database modeling
- Docker
- Software architecture
- Clean Architecture
- SOLID principles

---

# ▶️ Running the Project

## Requirements

- Java 17+
- Maven

## Clone the repository

```bash
git clone https://github.com/absjuniordev/abs-benefits.git
```

## Run the application

```bash
./mvnw spring-boot:run
```

## Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

# 📡 API Endpoints

Examples:

```http
POST   /auth/register
POST   /auth/login

GET    /enterprises
POST   /enterprises

GET    /employees
POST   /employees

GET    /benefits
POST   /benefits

POST   /wallets/{employeeId}/credit
POST   /wallets/{employeeId}/debit

GET    /reports/enterprises/{id}
```

Complete API documentation is available through Swagger.

---

# 🧪 Project Status

🚧 **In Development**

ABS Benefits is continuously evolving with new features, architectural improvements, and infrastructure enhancements.

---

# 👨‍💻 Author

Developed by **Arnaldo Borges dos Santos Junior**

Backend Developer

---

## About ABS

**ABS — Application Backend Solutions**

A personal portfolio focused on building modern backend applications with Java, Spring Boot, and enterprise software engineering practices.

---

# 📄 License

This project is licensed under the MIT License and is available for learning and educational purposes.
