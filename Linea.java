package POO_Tienda;

public class Linea {
    private double cantidad;
    private Producto producto;

    public Linea(double cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double calcularSubtotal() {
        return cantidad * producto.getPrecio();
    }

    public Producto getProducto() {
        return producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "cantidad=" + cantidad +
                ", producto=" + producto.getNombre() +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}
