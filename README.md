# Sistema de Gestión Vehicular

## Descripción
Este proyecto es una aplicación de escritorio desarrollada en Java con Swing para gestionar vehículos, técnicos y mantenimientos. Utiliza una base de datos MySQL para almacenar la información y permite realizar operaciones CRUD completas.

## Características
- Registro y gestión de vehículos.
- Registro y gestión de técnicos.
- Registro de mantenimientos con asociación entre vehículos y técnicos.
- Interfaz gráfica amigable.
- Persistencia de datos mediante JDBC.

## Tecnologías utilizadas
- Java
- Swing (Interfaz gráfica)
- MySQL
- JDBC

## Requisitos
- JDK 8 o superior
- MySQL Server
- IDE como NetBeans, IntelliJ o Eclipse

## Instrucciones de instalación
1. Clona el repositorio o descarga el código fuente.
2. Crea la base de datos ejecutando el script `bd_gestion_vehicular.sql` incluido en la carpeta anexos.
3. Configura los datos de conexión en la clase `Conexion.java`.
4. Ejecuta el formulario principal o la clase `Main.java` desde tu IDE.

## Estructura del proyecto
```

 /src
 ├── conector/         → Contiene los archivos .jar utilizados en el proyecto
 ├── conexión/            → conexión a la base de datos
 ├── controlador/          → Lógica del negocio
 ├── img/    → Recursos visuales para el proyecto
 ├── modelo/         → Contiene las clases del proyecto
 └── vista/      → Formularios del proyecto

```

## Autor
Jhon Troya
