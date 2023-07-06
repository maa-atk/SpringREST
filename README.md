# Java Spring Development Notes

These are notes summarizing key concepts and annotations related to Java Spring development. It covers various topics such as Spring Core, Spring MVC, Spring Data Access, Spring Boot, and additional Spring features.

## Table of Contents
- [Introduction](#introduction)
- [Spring Core](#spring-core)
- [Spring MVC](#spring-mvc)
- [Spring Data Access](#spring-data-access)
- [Spring Boot and Application Development](#spring-boot-and-application-development)
- [Additional Spring Features](#additional-spring-features)
- [Annotations](#annotations)

## Introduction
- POJO Objects: Plain Old Java Objects used to represent structured data.
- WAR File: Web Application Archive, a file format for packaging web applications.
- Dependency Injection: Design pattern for achieving loose coupling between components.
- Minimize Boilerplate Code: Using helper classes and frameworks to reduce repetitive code.

## Spring Core
- Inversion of Control (IoC) Container: Manages object creation and dependency injection.
- Bean Factory: Container for holding beans.
- Component Scanning: Automatically detects and registers beans based on annotations.
- Bean Scopes: Define the lifecycle and visibility of beans.
- Bean Lifecycle: Initialization and destruction phases of beans.

## Spring MVC
- Controllers: Handle HTTP requests and generate responses.
- Request Mapping: Maps HTTP requests to specific handler methods or classes.
- Request Parameters: Handle query parameters and form data.
- Request Body: Bind the HTTP request body to a method parameter.
- Views and Templates: Render the UI using view technologies.
- Exception Handling: Customize exception handling using annotations.

## Spring Data Access
- JPA (Java Persistence API): Specification for ORM in Java.
- Hibernate: ORM framework implementing JPA.
- Entity Class: Represents a mapped object in the database.
- JPQL (Java Persistence Query Language): Query language for JPA.
- Repository Pattern: Data access object (DAO) layer using Spring Data repositories.
- Transactions: Manage database transactions using annotations.

## Spring Boot and Application Development
- Maven: Build automation tool for managing dependencies and project build processes.
- Spring Boot: Framework for simplifying Spring application development.
- Annotations: An overview of annotations used in Spring.

## Additional Spring Features
- AOP (Aspect-Oriented Programming): Separating cross-cutting concerns from the main application logic.
- Spring Security: Authentication and authorization framework for securing applications.
- Spring Actuator: Monitoring and managing applications.
- Spring Testing: Unit testing and integration testing using Spring-specific features.
- JMS (Java Message Service): Messaging standard for asynchronous communication.
- JMX (Java Management Extensions): Remote monitoring and management of Java applications.

## Annotations
- `@Component`, `@RestController`, `@Repository`, `@Service`: Annotations used for component scanning and auto-detection of Spring-managed beans.
- `@Autowired`: Autowires dependencies by type or qualifier.
- `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PatchMapping`: Annotations for mapping HTTP requests to controller methods.
- `@PathVariable`: Binds a path variable from the URL to a method parameter.
- `@RequestBody`: Binds the HTTP request body to a method parameter.
- `@RequestParam`: Binds a request parameter to a method parameter.
- `@ModelAttribute`: Binds request parameters to a model object.
- `@SessionAttribute`: Binds session attributes to a method parameter.
- `@InitBinder`: Customize data binding process or register custom binders.
- `@ExceptionHandler`: Handles exceptions thrown within

a controller and returns appropriate responses.

Please note that this is not an exhaustive list of all Spring annotations. There are many more annotations available in the Spring framework, each serving a specific purpose. For a more comprehensive list and detailed explanations of Spring annotations, please refer to the official Spring Framework documentation.

For more information and examples on Spring annotations, you can also refer to the following resources:
- [Baeldung's Guide to Spring Annotations](https://www.baeldung.com/spring-annotations-guide)
- [Spring Framework Reference Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-annotation-config)

