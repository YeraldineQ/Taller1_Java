package Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Disponible por defecto
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public void prestar() {
        if (disponible) {
            disponible = false;
        }
    }


    public void devolver() {
        if (!disponible) {
            disponible = true;
        }
    }
}
