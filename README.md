# Sistema de Gestión Hotelera – API REST

## Descripción

API RESTful desarrollada en Java Spring Boot para la gestión de un hotel. Permite el manejo de clientes, habitaciones, reservas y servicios adicionales.  
Incluye documentación interactiva generada automáticamente con Swagger (OpenAPI).

---

## Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Springdoc OpenAPI (Swagger)
- Git y GitHub

---

## Instalación y configuración

1. **Clona el repositorio:**
    ```bash
    git clone https://github.com/tuusuario/hotelapi.git
    cd hotelapi
    ```
2. **Configura la base de datos** en el archivo  
   `src/main/resources/application.properties`:
    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
    spring.datasource.username=TU_USUARIO
    spring.datasource.password=TU_CONTRASEÑA
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    ```
    *(Reemplaza usuario y contraseña por los tuyos)*

3. **Ejecuta el proyecto:**  
    Desde IntelliJ con el botón "Run"  
    o por consola:
    ```bash
    ./mvnw spring-boot:run
    ```

---

## Endpoints principales

### **Clientes**

| Método | Endpoint           | Descripción                       |
|--------|--------------------|-----------------------------------|
| GET    | /api/clientes      | Lista todos los clientes          |
| POST   | /api/clientes      | Crea un nuevo cliente             |
| GET    | /api/clientes/{id} | Consulta cliente por ID           |
| PUT    | /api/clientes/{id} | Actualiza datos de un cliente     |
| DELETE | /api/clientes/{id} | Elimina un cliente                |

<!-- Puedes agregar tablas similares para habitaciones, reservas, servicios... -->

---

## Pruebas de los servicios

- La documentación interactiva y pruebas de la API están disponibles en:  
  [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

- Puedes probar los endpoints directamente desde Swagger.

---

## Control de versiones

Este proyecto utiliza **Git** como sistema de control de versiones y está alojado en [GitHub](https://github.com/tuusuario/hotelapi).

**Comandos básicos utilizados:**
```bash
git init
git add .
git commit -m "Primer commit"
git remote add origin https://github.com/tuusuario/hotelapi.git
git push -u origin main
