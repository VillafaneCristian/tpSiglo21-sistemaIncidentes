# Sistema de Gestión de Incidentes y Equipamiento

## Descripción

Este proyecto consiste en un prototipo desarrollado en Java y MySQL para la gestión de incidentes informáticos y equipamiento tecnológico.

Fue realizado como parte de la Actividad Práctica Integradora de la materia Seminario de práctica informática.

El sistema permite:

* Registrar incidentes.
* Listar incidentes registrados.
* Gestionar equipamientos.
* Consultar equipamientos almacenados en la base de datos.
* Aplicar conceptos de Programación Orientada a Objetos (POO).

---

## Tecnologías utilizadas

* Java 17
* MySQL
* JDBC
* Maven
* IntelliJ IDEA
* Git y GitHub

---

## Base de datos

El proyecto utiliza MySQL para la persistencia de los datos.

La base de datos utilizada es:

```text
sistema_incidentes
```

Dentro del repositorio se incluye el archivo:

```text
sistema_incidentes.sql
```

Este archivo contiene la estructura y los datos necesarios para recrear la base de datos utilizada durante el desarrollo del prototipo.

### Restauración de la base de datos

1. Iniciar MySQL o XAMPP.
2. Acceder a phpMyAdmin.
3. Crear una base de datos llamada:

```text
sistema_incidentes
```

4. Seleccionar la opción **Importar**.
5. Elegir el archivo:

```text
sistema_incidentes.sql
```

6. Ejecutar la importación.

Una vez finalizado el proceso, la aplicación estará lista para conectarse a la base de datos.


---

## Estructura del proyecto

```text
src
 └─ main
     └─ java
         ├─ dao
         └─ model
```

### Paquete model

Contiene las clases del dominio:

* Incidente
* Equipamiento
* PC
* Impresora

### Paquete dao

Contiene las clases de acceso a datos:

* Conexion
* IncidenteDAO
* EquipamientoDAO

---

## Conceptos de POO aplicados

### Encapsulamiento

Uso de atributos privados y métodos getter/setter.

### Abstracción

Clase abstracta Equipamiento.

### Herencia

Las clases PC e Impresora heredan de Equipamiento.

### Polimorfismo

Redefinición del método mostrarInfo() en las clases hijas.

---

## Ejecución

1. Importar la base de datos utilizando el archivo `sistema_incidentes.sql`.
2. Verificar los parámetros de conexión en la clase `Conexion.java`.
3. Compilar el proyecto mediante Maven.
4. Ejecutar la clase `Main.java`.
5. Utilizar el menú para registrar y consultar incidentes y equipamientos.

---

## Autor

Cristian Villafañe


