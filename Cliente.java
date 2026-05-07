package POO_Tienda;

import java.util.LinkedList;

public class Cliente {
	private String id;
    private String nombre;
    private String email;
    private LinkedList<Orden> ordenes;

	public Cliente(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.ordenes = new LinkedList<>();
    }

    public void agregarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public void mostrarListaOrdenes() {
        for (Orden orden : ordenes) {
            System.out.println(orden);
        }
    }

    public void mostrarListaOrdenesIniciadas() {
        for (Orden orden : ordenes) {
            if (orden.getEstado().equalsIgnoreCase("Iniciada")) {
                System.out.println(orden);
            }
        }
    }

    public void mostrarListaOrdenesPendientes() {
        for (Orden orden : ordenes) {
            if (orden.getEstado().equalsIgnoreCase("Pendiente")) {
                System.out.println(orden);
            }
        }
    }

    public void mostrarListaOrdenesTerminadas() {
        for (Orden orden : ordenes) {
            if (orden.getEstado().equalsIgnoreCase("Terminada")) {
                System.out.println(orden);
            }
        }
    }

    public int calcularTotal() {
        int suma = 0;
        for (Orden orden : ordenes) {
            suma += orden.calcularTotal();
        }
        return suma;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public LinkedList<Orden> getOrdenes() {
        return ordenes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
