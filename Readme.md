# Prueba tecnica resuelta - MI NEGOCIO
# Autor: Fernando Sangopanta 
## La siguiente API creada en Spring Boot esta construida con: 
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- MapStruct

## Para la ejecucion de la API se debe tener instalado: 
- Java 8
- Gradle
- PostgreSQL

## IMPORTANTE: No contiene ningun tipo de pruebas: unitarias, integracion, etc.

## Para la ejecucion de la API se debe: 
- Crear una base de datos en PostgreSQL con el nombre: mi-negocio
- El usuario es default **postgres** y la contraseña es **12345**
- En el archivo **application.properties** se debe cambiar informacion como:puerto, usuario y la contraseña de la base de datos por si se lo requiere.
- Abrir el proyecto en cualquier IDE de desarrollo como: Eclipse, IntelliJ, etc.
- Ejecutar el proyecto como: Spring Boot App
- Ingresar al puerto 8080 de la API: http://localhost:8080/prueba/api

## Para probar la API se debe:
- Para la entidad clientes **CLIENTES**
- Listar los clientes  con el metodo GET: http://localhost:8080/prueba/api/clients/allClients
- Crear un cliente con el metodo POST: http://localhost:8080/prueba/api/clients/save
- Actualizar un cliente con el metodo PUT: http://localhost:8080/prueba/api/clients/update/id
- Eliminar un cliente con el metodo DELETE: http://localhost:8080/prueba/api/clients/delete/id
- Llamar un cliente en especifico GET: http://localhost:8080/prueba/api/clients/id
- Para la entidad Sucursal **SUCURSAL**
- Listar los productos  con el metodo GET: http://localhost:8080/prueba/api/branchs/allBranchs
- Crear un producto con el metodo POST: http://localhost:8080/prueba/api/branchs/save
- Devolver una sucursal en especifico GET: http://localhost:8080/prueba/api/branchs/id
- Guarda una sucursal en un cliente dado su id POST: http://localhost:8080/prueba/api/branchs/saveBranch/id
- Devolver sucursales por cliente dado su id GET: http://localhost:8080/prueba/api/branchs/branchsByClient/id









