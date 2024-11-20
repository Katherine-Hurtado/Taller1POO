package Class;

import java.util.ArrayList;

public class Libro extends ArrayList {
    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, int isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        setDisponible(false);
    }
}
