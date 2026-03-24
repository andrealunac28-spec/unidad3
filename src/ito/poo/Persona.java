package ito.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String identificacion;
    private String celular;
    private String direccion;
    private List<Prestamo> prestamos;

    public Persona(String nombre, String identificacion, String celular, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.celular = celular;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public int prestamosPorFecha(LocalDate fecha) {
        int contador = 0;
        for (Prestamo p : prestamos) {
            if (p.getFechaSolicitud().equals(fecha)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean puedePedirPrestamo(LocalDate fecha) {
        return prestamosPorFecha(fecha) < 3;
    }

    public void agregarPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    @Override
    public String toString() {
        return nombre + " - " + identificacion;
    }
}
