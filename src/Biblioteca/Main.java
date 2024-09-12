package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Yeraldine", "Quintero");
        Usuario usuario2 = new Usuario("Yefferson", "Tavera");
        Bibliotecario bibliotecario = new Bibliotecario("Pepito", "Pérez");

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("la Casa de los Espíritus", "Isabel Allende", "111111"));
        libros.add(new Libro("La Bruja", "Germán Castro Caicedo", "222222"));
        libros.add(new Libro("El Símbolo Perdido", "Dan Brown", "333333"));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "444444"));




        bibliotecario.prestarLibro(libros.get(0), usuario1);
        bibliotecario.prestarLibro(libros.get(1), usuario1);
        bibliotecario.prestarLibro(libros.get(2), usuario1);
        bibliotecario.prestarLibro(libros.get(3), usuario1);

        bibliotecario.prestarLibro(libros.get(0), usuario2);


        bibliotecario.devolverLibro(libros.get(0), usuario1);
        bibliotecario.devolverLibro(libros.get(1), usuario2);


        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        bibliotecario.mostrarDatos();


        int totalLibrosPrestados = 0;
        for (Libro libro : libros) {
            if (!libro.isDisponible()) {
                totalLibrosPrestados++;
            }
        }
        System.out.println("Total de libros prestados (POO): " + totalLibrosPrestados);


        long totalLibrosPrestadosFuncional = libros.stream()
                .filter(libro -> !libro.isDisponible())
                .count();
        System.out.println("Total de libros prestados (Funcional): " + totalLibrosPrestadosFuncional);
    }
}