# 🎓 Student CRUD API (Spring Boot + Gradle + H2 + JPA)  

This is a basic Spring Boot application demonstrating CRUD operations (Create, Read, Update, Delete) for managing Student records.  
It uses Spring Data JPA for database interactions and H2 in-memory database for quick setup and testing.


## 🛠️ Technologies Used

- **Java 17+** (Must Exists in System)
- **Spring Boot 3.x**
- **Hibernate (JPA)**
- **H2 In-Memory Database**
- **Gradle (Build Tool)**
- **Spring Data JPA**


## ⭐ Features (CRUD Operations)

The application provides full CRUD operations for Student management:

- **Create Student** — `POST /postStudent`
- **Get Student by ID** — `GET /getstudent/{id}`
- **Get All Students** — `GET /getAllstudents`
- **Update Student** — `PUT /putStudent`
- **Delete Student** — `DELETE /deleteStudent/{id}`

## Folder Structure
```bash
src/
├── main/
│   ├── java/
│   │   └── com/Stud_crud/Student/
│   │       ├── StudentApplication.java
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       ├── application.properties
│       ├── schema.sql
│       └── data.sql
├── build.gradle
└── settings.gradle

```

# 🚀 How to Run the Project (By Cloning)

```bash
 ##1️⃣ Clone the repository
 git clone https://github.com/dineshraju-4722/Spring-CRUD-Operations.git

## 2️⃣ Navigate into the project folder
cd Spring-CRUD-Operations


## 3️⃣ Run the application using Gradle Wrapper
(Automatically downloads all dependencies)

./gradlew bootRun     # Linux/Mac
gradlew bootRun       # Windows


     📦 Running the Application as a JAR
      * Build the JAR
         ./gradlew build

      * Run the JAR
          java -jar build/libs/Spring-CRUD-Operations-0.0.1-SNAPSHOT.jar

## 4️⃣ Access API Endpoints

Base URL:
http://localhost:8080

## 5️⃣ Access H2 Database Console
http://localhost:8080/h2-console


   Use these settings:

   JDBC URL: jdbc:h2:mem:testdb
   User: sa
   Password: (leave blank)
```








