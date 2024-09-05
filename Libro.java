import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
        System.out.println("Numero ISBN del libro: " + isbn);
    }

    public boolean esAntiguo() {
        int añoActual = 2024;
        return (añoActual - añoPublicacion) > 20;
    }

    public String getTitulo() {
        return titulo;
    }
}
