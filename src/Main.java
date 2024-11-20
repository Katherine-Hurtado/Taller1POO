import Class.Libro;
import Class.Bibliotecario;
import Class.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Libro> listaDeLibros = new ArrayList<>();

        // Crear libros
        Libro libro1 = new Libro("Un Mundo feliz", "Aldous Huxley", 465, true);
        Libro libro2 = new Libro("Ojos de fuego", "Stephen King", 9585, true);

        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);

        System.out.println("Hay " + listaDeLibros.size()+ " Libros Prestados");

        // Crear usuario
        Usuario usuario = new Usuario("Katherine", "Hurtado");

        // Crear bibliotecario

        Bibliotecario bibliotecario = new Bibliotecario("Milena", "Suarez");

        // Mostrar datos
        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();

        // Prestar libros
        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario, libro2);

        // Devolver libro
        bibliotecario.devolverLibro(usuario, libro1);

    }


}