package ito.poo;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaSolicitud;
    private LocalDate fechaDevolucion;
    private Material material;
    private Persona persona;

    public Prestamo(LocalDate fechaSolicitud, Material material, Persona persona) {
        this.fechaSolicitud = fechaSolicitud;
        this.material = material;
        this.persona = persona;
    }

    public void devolver() {
        this.fechaDevolucion = LocalDate.now();
        material.devolver();
    }

    public boolean estaActivo() {
        return fechaDevolucion == null;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    @Override
    public String toString() {
        return persona + " -> " + material +
                " | Solicitud: " + fechaSolicitud +
                (fechaDevolucion != null ? " | Devuelto: " + fechaDevolucion : " | ACTIVO");
    }
}
