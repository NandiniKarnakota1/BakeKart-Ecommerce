🛒 BakeKart – E-Commerce Web Application

BakeKart is a full-stack E-commerce web application developed for a bakery business featuring cakes and pizzas. The application enables administrators to manage products and categories while allowing users to browse and view product details.

🚀 Features
🔐 Admin Panel

Admin login and registration

Add, update, and delete products

Add, update, and delete categories

Product attributes include name, price, weight, description, and image upload

👥 User Module

Browse products by category

View detailed product information

Dynamic rendering using Thymeleaf templates

🏗️ Architecture & Backend

Developed using Spring Boot following layered architecture (Controller → Service → Repository)

Implemented Spring Data JPA & Hibernate for ORM

Integrated PostgreSQL database

Implemented full CRUD operations

Used Multipart file upload for handling product images

🛠️ Tech Stack

Backend: Spring Boot, Spring Data JPA, Hibernate
Database: PostgreSQL
Frontend: Thymeleaf, HTML, CSS, Bootstrap
Build Tool: Maven
Language: Java

## Note

Currently, product image uploads work locally but may not display correctly in all environments. All other features are fully functional.

---

## How to Run

1. Clone the repo:<https://github.com/NandiniKarnakota1/BakeKart-Ecommerce.git>


2. Configure PostgreSQL:
   Database: ecommerce_db

   Username & password in application.properties

3. Build and run:
   mvn spring-boot:run

4. Open in browser:
   http://localhost:8080/admin
   

