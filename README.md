# Spring Boot Microservice

Este proyecto implementa un sistema de microservicios utilizando **Spring Boot** y varias herramientas del ecosistema Spring. La arquitectura está diseñada para ser modular, escalable y fácil de mantener, permitiendo la integración y comunicación eficiente entre diferentes servicios.

## Características principales

- **Eureka Server**: Servicio de descubrimiento para registrar y localizar microservicios.
- **Spring Cloud Gateway**: Enrutamiento y balanceo de carga para el tráfico de microservicios.
- **Spring Boot Actuator**: Monitoreo y métricas para la observabilidad del sistema.
- **Spring Cloud Config Server**: Gestión centralizada de la configuración de los microservicios.
- **Spring Data JPA**: Simplificación del acceso a datos relacionales con ORM.
- **Hibernate**: Mapeo objeto-relacional para la persistencia de datos.
- **Soporte para PostgreSQL y MySQL**: Compatibilidad con bases de datos relacionales para mayor flexibilidad.
- **Maven**: Gestión de dependencias y ciclo de vida del proyecto.

## Tecnologías aplicadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot**: Framework base para microservicios.
- **Spring Cloud Eureka**: Descubrimiento de servicios.
- **Spring Cloud Gateway**: Puerta de enlace para microservicios.
- **Spring Data JPA**: Persistencia de datos.
- **Hibernate**: ORM para manejar las bases de datos.
- **PostgreSQL/MySQL**: Bases de datos relacionales.
- **Maven**: Gestión de dependencias.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Mauricio-1979/SpringMicroservice

2. Construye el proyecto con Maven:
mvn clean install

3. Configura la base de datos (PostgreSQL o MySQL) en el archivo application.properties o application.yml
 
4. Inicia el proyecto
mvn spring-boot:run


