package POO_Tienda;

public class Main {
    public static void main(String[] args) {
        Control control = new Control();
        Producto p1 = new Producto("Laptop", 10, "Unidad", 450000);
        Producto p2 = new Producto("Mouse", 30, "Unidad", 15000);
        Producto p3 = new Producto("Teclado", 20, "Unidad", 25000);
        control.agregarProducto(p1);
        control.agregarProducto(p2);
        control.agregarProducto(p3);
        Cliente cliente1 = new Cliente(
                "00",
                "Rei Ayanami",
                "rei@gmail.com"
        );

        control.agregarCliente(cliente1);
        Orden orden1 = new Orden("Pendiente");
        Linea l1 = new Linea(1, p1);
        Linea l2 = new Linea(2, p2);
        orden1.agregarLinea(l1);
        orden1.agregarLinea(l2);
        cliente1.agregarOrden(orden1);
        control.agregarOrden(orden1);
        control.llamarClientes();
        System.out.println();
        control.llamarProducto();
        System.out.println();
        control.llamarOrden();
        System.out.println();
        System.out.println("===== DETALLE ORDEN =====");
        orden1.detalle();
        System.out.println();
        System.out.println("Total Orden: " + orden1.calcularTotal());
    }
}
