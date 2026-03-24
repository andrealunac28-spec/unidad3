package ito.poo;

public class Audiolibro extends Material {
    private int duracion;
    private String narrador;
    private String formato;

    public Audiolibro(String codigo, String titulo, String autor, int anioPublicacion, int numPaginas,
                      int duracion, String narrador, String formato) {
        super(codigo, titulo, autor, anioPublicacion, numPaginas);
        this.duracion = duracion;
        this.narrador = narrador;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() + " - Narrador: " + narrador + " - Formato: " + formato;
    }
}
