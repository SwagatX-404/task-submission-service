## TASK SUBMISSION SERVICE FOR TASK MANAGEMNET - MICROSERVICE 3



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
```