# 📚 Course Registration System (Spring Boot)

A backend application developed using Spring Boot that allows students to register, view courses, and enroll in them. This project demonstrates REST API development, database integration, and backend architecture.

---

## 🚀 Features
- Student registration and login
- View available courses
- Enroll in courses
- CRUD operations for courses
- Exception handling and validation

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven

---

## 🏗️ Architecture
This project follows **Layered Architecture**:
- Controller Layer (Handles API requests)
- Service Layer (Business logic)
- Repository Layer (Database interaction)

---

## ⚙️ Setup Instructions

### Prerequisites
- Java 8+
- Maven
- MySQL

### Run Locally
1. Clone the repo: git clone https://github.com/nithiyasrij12/course-registration-system.git
2.  Configure DB in `application.properties`
      spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
      spring.datasource.username=root
      spring.datasource.password=Sri@2000
3. Run project
   mvn spring-boot:run

---

## 🔗 API Endpoints

### Student
- POST `/students/register`
- GET `/students`

### Course
- GET `/courses`
- POST `/courses`

### Enrollment
- POST `/enroll`

---

## 📬 Sample Request (Postman)
POST /students/register
{
"name": "Nithiya",
"email": "test@gmail.com
"
}


---

## 📈 Future Enhancements
- JWT Authentication
- Role-based access (Admin/User)
- Frontend integration (React)

---

## 👩‍💻 Author
Nithiyasri J

