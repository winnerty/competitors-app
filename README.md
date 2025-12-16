# Competition Management System

Two-module Maven application for competitor management with REST API built on Spring Boot.

## 🏗️ Project Structure

```
root/
├── core-module/           # Business logic & data access
│   ├── config/           # Spring configuration
│   ├── dao/              # Data Access Objects
│   ├── model/            # Domain models (Competitor)
│   ├── service/          # Deserialization services
│   └── test/             # Unit tests
│
├── rest-module/          # REST API layer
│   ├── controller/       # REST endpoints
│   ├── dto/              # Data Transfer Objects
│   ├── repository/       # Repository pattern
│   └── test/             # REST tests
│
└── pom.xml
```

## Technologies

- Java 21, Maven
- Spring Boot, Jackson (JSON)
- JUnit, JUnit Jupiter

## Quick Start

```bash
# Build project
mvn clean install

# Run tests
mvn test

# Start REST API
cd rest-module && mvn spring-boot:run
```

## REST API

Base URL: `http://localhost:8080/competitors`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/competitors` | Get all |
| POST | `/competitors` | Add new |
| PUT | `/competitors/{index}` | Replace |
| PATCH | `/competitors/{index}` | Update |
| DELETE | `/competitors/{index}` | Delete |

## 📦 Modules

**core-module**: Competitor model, DAO, deserialization, Spring config  
**rest-module**: Spring Boot app, REST controller, repository, DTOs
