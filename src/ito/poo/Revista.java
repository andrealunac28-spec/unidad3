package ito.poo;

public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String codigo, String titulo, String autor, int anioPublicacion, int numPaginas,
                   int numeroEdicion, String mesPublicacion) {
        super(codigo, titulo, autor, anioPublicacion, numPaginas);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + " - Edición: " + numeroEdicion + " - " + mesPublicacion;
    }
}
