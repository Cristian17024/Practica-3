public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "9783140464079");
        Libro libro2 = new Libro("Matilda", "Roald Dahl", 1988, "9780140327595");
        Libro libro3 = new Libro("El Libro de la Selva", "Rudyard Kipling", 1894, "9789520417680");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Estos son los libros:");
        biblioteca.mostrarLibros();

        String tituloBuscado = "El principito";
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
        if (libroEncontrado == null) {
            System.out.println("Ese libro no existe");
        } else {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInformacion();
        }
    }
}
