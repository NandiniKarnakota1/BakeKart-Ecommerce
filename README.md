# 🛒 BakeKart - E-Commerce Web Application

BakeKart is a full-stack E-Commerce web application developed for a bakery business featuring cakes and pizzas. The application allows administrators to manage products and categories, while users can browse and view product details through a dynamic web interface.

---

## 🚀 Features

### 🔐 Admin Module
- Admin login and registration
- Add, update, delete products
- Add, update, delete categories
- Product details include name, price, weight, description, and image upload
- Full CRUD functionality

### 👥 User Module
- Browse products by category (Cake, Pizza, etc.)
- View detailed product information
- Dynamic UI rendering using Thymeleaf

---

## 🏗️ Architecture

The application follows a layered architecture:

Controller → Service → Repository → Database

- Spring MVC for request handling
- Spring Data JPA & Hibernate for ORM
- PostgreSQL for database management
- Thymeleaf for dynamic HTML rendering

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Database
- PostgreSQL

### Frontend
- Thymeleaf
- HTML
- CSS
- Bootstrap

### Tools
- Maven
- Git


---

## 📂 Project Highlights

- Implemented complete CRUD operations
- Integrated PostgreSQL with Spring Boot
- Used MVC architecture principles
- Implemented multipart file upload for product images
- Designed responsive UI using Bootstrap
- Structured code following clean coding practices

---

## ⚙️ How to Run the Project

1. Clone the repository:
   git clone https://github.com/NandiniKarnakota1/BakeKart-Ecommerce.git

2. Create PostgreSQL database:
   Database name: ecommerce_db

3. Configure application.properties:
   - Set your PostgreSQL username
   - Set your PostgreSQL password

4. Build and run:
   mvn spring-boot:run

5. Open in browser:
   http://localhost:8080/admin

---

## 🎯 Learning Outcomes

- Hands-on experience with Spring Boot backend development
- Understanding of layered architecture (Controller, Service, Repository)
- Database integration using JPA & Hibernate
- Server-side rendering using Thymeleaf
- Handling file uploads in web applications

---

## 👩‍💻 Author

Nandini K  
Java Backend Developer  
GitHub: https://github.com/NandiniKarnakota1
