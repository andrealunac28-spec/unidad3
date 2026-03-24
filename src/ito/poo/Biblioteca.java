package ito.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;
    private List<Persona> personas;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        materiales = new ArrayList<>();
        personas = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void prestarMaterial(Persona p, Material m) {
        LocalDate hoy = LocalDate.now();

        if (m.isDisponible() && p.puedePedirPrestamo(hoy)) {
            Prestamo pr = new Prestamo(hoy, m, p);
            m.prestar();
            p.agregarPrestamo(pr);
            prestamos.add(pr);
        }
    }

    public void devolverMaterial(Prestamo p) {
        p.devolver();
    }

    public void mostrarPrestamos() {
        for (Prestamo pr : prestamos) {
            System.out.println(pr);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: " +
                "Materiales=" + materiales.size() +
                ", Personas=" + personas.size() +
                ", Prestamos=" + prestamos.size();
    }
}
