## TASK SUBMISSION SERVICE FOR TASK MANAGEMNET - MICROSERVICE 3


## Tech Stack
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

## Database Configuration 
- [application.yaml] file
```bash 
server:
  port: 5003

spring:
  application:
    name: TASK-SUBMISSION-SERVICE

  jpa:
    hibernate.ddl-auto: update
  datasource:
    url: jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_task_submission_service
    username: root
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver


    eureka:
    instance:
      hostname: localhost
      prefer-ip-address: true
    client:
      register-with-eureka: false
      fetch-registry: false
      service-url:
        defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/

```

## 👤 Author

**Swagat Murmu**  
*Master of Computer Applications (MCA)*
- **Primary Skills:** 
  - **Backend:** Java & Spring Boot
  - **Frontend:** React & JavaScript
  - **Database:** SQL
