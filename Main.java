public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1, "Antoine de Saint-Exupéry", "antoine@gmail.com");
        Autor autor2 = new Autor(2, "Roald Dahl", "roald@gmail.com");
        Autor autor3 = new Autor(3, "Rudyard Kipling", "rudyard@uabc.edu.mx");

        Libro libro1 = new Libro("El principito", autor1, 1943, "9783140464079");
        Libro libro2 = new Libro("Matilda", autor2, 1988, "9780140327595");
        Libro libro3 = new Libro("El Libro de la Selva", autor3, 1894, "9789520417680");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro.obtenerInformacion());
        }

        String tituloBuscado = "El principito";
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
        if (libroEncontrado == null) {
            System.out.println("Ese libro no existe");
        } else {
            System.out.println(libroEncontrado.obtenerInformacion());
        }

        libro1.setPrestado(true);

               
        for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
            System.out.println(libro.obtenerInformacion());
        }
    }
}
