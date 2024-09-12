# Sistema de Gestión de Biblioteca en Java

Este proyecto es un sistema de gestión de biblioteca desarrollado en Java, que utiliza principios de Programación Orientada a Objetos (POO). El sistema permite gestionar libros, usuarios y préstamos, aplicando conceptos de encapsulamiento, herencia, polimorfismo, interfaces y abstracción.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- **`Persona`**: Clase base abstracta que contiene los atributos comunes para las personas en el sistema (nombre y apellido) y un método abstracto `mostrarDatos()`.

- **`Usuario`**: Hereda de `Persona` y representa a los clientes que pueden pedir préstamos de libros. Maneja el número de libros prestados y proporciona la implementación del método `mostrarDatos()`.

- **`Bibliotecario`**: Hereda de `Persona` e implementa la interfaz `Gestionable`. Representa al empleado que gestiona el sistema y proporciona la implementación de los métodos `prestarLibro()` y `devolverLibro()`.

- **`Libro`**: Representa un libro en la biblioteca con atributos como título, autor, ISBN y disponibilidad. Proporciona métodos para prestar y devolver libros.

- **`Gestionable`**: Interfaz que define los métodos `prestarLibro()` y `devolverLibro()`, implementada por la clase `Bibliotecario`.

- **`Main`**: Clase con el método `main()` que simula el proceso de gestión del sistema de biblioteca. Incluye la creación de instancias de `Usuario`, `Bibliotecario` y `Libro`, y muestra cómo se realizan préstamos y devoluciones, y cómo se cuentan los libros prestados tanto con POO como con programación funcional.