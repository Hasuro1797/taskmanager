# Task Manager Application

## Descripción

Este proyecto es una aplicación web desarrollada en Java 8 utilizando Spring Boot MVC. La aplicación permite gestionar tareas a través de una interfaz web, con funcionalidades para registrar nuevas tareas y listar las tareas existentes.

## Tecnologías Utilizadas

- **Java 8**: Lenguaje de programación utilizado.
- **Spring Boot MVC**: Framework para construir aplicaciones web.
- **Maven**: Herramienta de gestión de proyectos y construcción.
- **Bootstrap**: Framework CSS para el diseño y estilo de la interfaz de usuario.
- **MyBatis**: Framework de mapeo objeto-relacional (ORM) para la persistencia de datos.
- **Base de Datos**: [Cualquier base de datos]. La conexión a la base de datos se maneja a través de una dependencia separada.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

## Pantallas de la Aplicación

1. **Pantalla de Inicio**: Muestra una pantalla de bienvenida con un botón para registrar una nueva tarea.
2. **Pantalla de Registro de Tarea**: Permite ingresar los datos para registrar una nueva tarea:
    - Nombre
    - Descripción
    - Fecha de inicio
3. **Listado de Tareas**: Muestra una lista de todas las tareas registradas.

## Configuración del Proyecto

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/Hasuro1797/taskmanager.git
   cd task-manager
   ```
2. **Configurar la Base de Datos y my Batis**

    Debes agregar la configuración de la base de datos en el archivo src/main/resources/application.properties. Sustituye database_name, database_username, y database_password con los valores correspondientes para tu base de datos MySQL:
    
    ```bash
   # Configuration de la base de datos MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/database_name?useSSL=false&serverTimezone=UTC
    spring.datasource.username=database_username
    spring.datasource.password=database_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    mybatis.mapper-locations=classpath:mapper/*.xml
    mybatis.type-aliases-package=com.example.taskApp.model
   ```
3. **Construir el Proyecto**

    Asegúrate de tener Maven instalado. Construye el proyecto con el siguiente comando:

    ```bash
   mvn clean install
   ```
4. **Ejecutar la Aplicación**

    Ejecuta la aplicación con el siguiente comando:

     ```bash
   mvn spring-boot:run
   ```

    La aplicación estará disponible en http://localhost:8080