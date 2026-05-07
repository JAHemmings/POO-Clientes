package POO_Tienda;

import java.util.LinkedList;

public class Control {
    private LinkedList<Cliente> clientes;
    private LinkedList<Producto> productos;
    private LinkedList<Orden> ordenes;

    public Control() {
        clientes = new LinkedList<>();
        productos = new LinkedList<>();
        ordenes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public void llamarClientes() {
        System.out.println("===== CLIENTES =====");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void llamarOrden() {
        System.out.println("===== ORDENES =====");

        for (Orden orden : ordenes) {
            System.out.println(orden);
        }
    }

    public void llamarProducto() {
        System.out.println("===== PRODUCTOS =====");

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
