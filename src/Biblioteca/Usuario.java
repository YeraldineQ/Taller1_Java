package Biblioteca;

public class Usuario extends Persona{
    private int librosPrestados;

    public Usuario(String nombre, String apellido){
        super(nombre, apellido);
        this.librosPrestados = 0;
    }

    public void incrementarLibrosPrestados() {
        librosPrestados++;
    }

    public void decrementarLibrosPrestados() {
        if (librosPrestados > 0) {
            librosPrestados--;
        }
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Nombre de usuario: " + nombre + " " + apellido + ", Libros prestados: " + librosPrestados);
    }
}
