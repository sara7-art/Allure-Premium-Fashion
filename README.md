# ALLURE Backend

## Overview

ALLURE Backend is a RESTful API built with Spring Boot that powers the ALLURE fashion e-commerce platform. It provides secure authentication, user registration, product management, shopping cart functionality, customer profile management, and order processing.

The application follows a layered architecture using Spring Boot, Spring Security, Spring Data JPA, and MySQL to provide a secure and scalable backend.

---

# Features

## Authentication

* JWT Authentication
* Secure Login
* Role-Based Authorization
* Password Encryption with BCrypt

## User Management

* User Registration
* Duplicate Username Validation
* Automatic Profile Creation
* Customer Profile Management

## Product Management

* Browse Products
* Search Products
* Product Categories
* Product Filtering

## Shopping Cart

* Add Products to Cart
* Update Cart
* Remove Products
* Clear Shopping Cart

## Checkout

* Secure Checkout
* Order Creation
* Shipping Address Retrieval
* Order Line Item Generation
* Shopping Cart Cleanup After Checkout

## Customer Profile

* View Profile
* Update Profile
* Address Management

---

# Technologies Used

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* JWT Authentication
* BCrypt Password Encoder

---

# Project Structure

```text
src
├── main
│   ├── java
│   │   └── org.yearup
│   │       ├── controllers
│   │       ├── models
│   │       ├── repository
│   │       ├── security
│   │       ├── service
│   │       └── Allure.java
│   └── resources
│       ├── application.properties
│     
```

---

# API Endpoints

## Authentication

| Method | Endpoint    | Description         |
| ------ | ----------- | ------------------- |
| POST   | `/login`    | Authenticate user   |
| POST   | `/register` | Register a new user |

## Products

| Method | Endpoint      |
| ------ | ------------- |
| GET    | `/products`   |
| GET    | `/categories` |

## Shopping Cart

| Method | Endpoint              |
| ------ | --------------------- |
| GET    | `/cart`               |
| POST   | `/cart/products/{id}` |
| DELETE | `/cart`               |

## Profile

| Method | Endpoint   |
| ------ | ---------- |
| GET    | `/profile` |
| PUT    | `/profile` |

## Orders

| Method | Endpoint  |
| ------ | --------- |
| POST   | `/orders` |
| GET    | `/orders` |

---

# Database

The backend uses **MySQL** for data persistence.

Main tables include:

* Users
* Profiles
* Products
* Categories
* Shopping Cart
* Orders
* Order Line Items

---

# Security

Authentication is secured using JSON Web Tokens (JWT).

Passwords are encrypted using BCrypt before being stored in the database.

Role-based authorization controls access to protected endpoints.

---

# Running the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure the MySQL database.
4. Update `application.properties` with your database credentials.
5. Run the Spring Boot application.
6. Access the API at:

```text
http://localhost:8080
```

---

# Future Enhancements

* Payment Gateway Integration
* Rewards Program
* Order Tracking
* Wishlist
* Product Reviews
* Inventory Management Dashboard

---

# Author

**Sara Yoda**

Software Development Student

Year Up United

2026
