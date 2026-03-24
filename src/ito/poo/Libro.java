package ito.poo;

public class Libro extends Material {
    private String genero;
    private String editorial;

    public Libro(String codigo, String titulo, String autor, int anioPublicacion, int numPaginas,
                 String genero, String editorial) {
        super(codigo, titulo, autor, anioPublicacion, numPaginas);
        this.genero = genero;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + genero + " - " + editorial;
    }
}
