package Biblioteca;

public class Bibliotecario extends Persona implements Gestionable {

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        // Validar si el usuario ya tiene 3 libros prestados
        if (usuario.getLibrosPrestados() >= 3) {
            System.out.println("El usuario " + usuario.getNombre() + " ya tiene el máximo de préstamos permitidos.");
            return;
        }

        // Validar si el libro está disponible
        if (!libro.isDisponible()) {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para préstamo.");
            return;
        }

        // Realizar el préstamo y registrar al usuario
        libro.prestar();
        usuario.incrementarLibrosPrestados();
        System.out.println("El usuario " + usuario.getNombre() + " ha tomado prestado el libro '" + libro.getTitulo() + "'.");
    }

    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        // Validar si el usuario tiene el libro prestado
        if (usuario.getLibrosPrestados() <= 0) {
            System.out.println("El usuario " + usuario.getNombre() + " no tiene libros para devolver.");
            return;
        }

        // Realizar la devolución y actualizar el estado del libro
        libro.devolver();
        usuario.decrementarLibrosPrestados();
        System.out.println("El usuario " + usuario.getNombre() + " ha devuelto el libro '" + libro.getTitulo() + "'.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + nombre + " " + apellido);
    }
}
