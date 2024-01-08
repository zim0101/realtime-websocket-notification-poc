# POC of Real-time Notifications Using Websocket in Spring Boot

## Overview

This repository contains a proof-of-concept (POC) Spring Boot MVC application with Thymeleaf that demonstrates real-time notifications using WebSocket. The application allows sending real-time notifications to all admin users when a new regular user registers.

## Features

- User registration with real-time notification to the admin user.
- Real-time notification updates displayed in Thymeleaf templates.

## Project Structure At A Glance
```
.
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── app
│   │   │           └── realtimewebsocketnotificationpoc
│   │   │               ├── config
│   │   │               │   ├── SecurityConfiguration.java
│   │   │               │   └── WebSocketConfig.java
│   │   │               ├── controller
│   │   │               │   ├── auth
│   │   │               │   │   ├── LoginController.java
│   │   │               │   │   └── RegistrationController.java
│   │   │               │   └── dashboard
│   │   │               │       ├── AdminDashBoardController.java
│   │   │               │       ├── DashboardRedirectController.java
│   │   │               │       └── UserDashboardController.java
│   │   │               ├── model
│   │   │               │   ├── Account.java
│   │   │               │   ├── enums
│   │   │               │   │   ├── NotificationType.java
│   │   │               │   │   └── Role.java
│   │   │               │   └── NotificationHistory.java
│   │   │               ├── RealtimeWebsocketNotificationPocApplication.java
│   │   │               ├── repository
│   │   │               │   ├── AccountRepository.java
│   │   │               │   └── NotificationHistoryRepository.java
│   │   │               ├── security
│   │   │               │   ├── AppUserDetailsService.java
│   │   │               │   └── EncryptionService.java
│   │   │               └── service
│   │   │                   ├── AccountService.java
│   │   │                   ├── AuthUserService.java
│   │   │                   ├── NotificationHistoryService.java
│   │   │                   └── NotificationSocketHandler.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   │           ├── auth
│   │           │   ├── login.html
│   │           │   └── register.html
│   │           └── dashboard
│   │               ├── admin.html
│   │               └── user.html
│   └── test
│       └── java
│           └── com
│               └── app
│                   └── realtimewebsocketnotificationpoc
│                       └── RealtimeSocketioNotificationPocApplicationTests.java
```

