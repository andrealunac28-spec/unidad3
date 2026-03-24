package ito.poo;

    public abstract class Material {
        private String codigo;
        private String titulo;
        private String autor;
        private int anioPublicacion;
        private int numPaginas;
        private boolean disponible;

        public Material(String codigo, String titulo, String autor, int anioPublicacion, int numPaginas) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
            this.numPaginas = numPaginas;
            this.disponible = true;
        }

        public void prestar() {
            disponible = false;
        }

        public void devolver() {
            disponible = true;
        }

        public boolean isDisponible() {
            return disponible;
        }

        @Override
        public String toString() {
            return codigo + " - " + titulo + " - " + autor;
        }
    }
