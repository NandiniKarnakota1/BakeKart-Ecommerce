
# BakeKart – Spring Boot Bakery E-Commerce Application

BakeKart is a simple e-commerce web application for a bakery, featuring cakes and pizzas. Built with **Spring Boot, PostgreSQL, Thymeleaf, HTML, CSS, and Bootstrap**, it allows admins to manage products and categories, and users to view available products.

---

## Features

### Admin Panel
- Login and registration for admin users
- Add, update, delete **products** (cakes & pizzas)
- Add, update, delete **categories** (e.g., Cake, Pizza)
- Products include **name, price, weight, description, and image**

### User Side
- Browse products by category
- View product details

### Backend
- Spring Boot REST architecture with **Service** and **Repository** layers
- PostgreSQL database integration
- Thymeleaf templates for dynamic HTML rendering
- Fully functional CRUD operations

---

## Tech Stack

- **Backend:** Spring Boot, Spring Data JPA, Hibernate
- **Database:** PostgreSQL
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Others:** Maven, Java 24, Multipart file upload for product images

---

## Note

Currently, product image uploads work locally but may not display correctly in all environments. All other features are fully functional.

---

## How to Run

1. Clone the repo:


2. Configure PostgreSQL:
   Database: ecommerce_db

   Username & password in application.properties

3. Build and run:
   mvn spring-boot:run

4. Open in browser:
   http://localhost:8080/admin
   

