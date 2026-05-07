package POO_Tienda;

public class Producto {
    private static int consecutivoGlobal = 1;

    private int consecutivo;
    private String nombre;
    private double existencias;
    private String unidad;
    private double precio;
    private int codigo;

    public Producto(String nombre, double existencias, String unidad, double precio) {
        this.consecutivo = consecutivoGlobal++;
        this.nombre = nombre;
        this.existencias = existencias;
        this.unidad = unidad;
        this.precio = precio;
        this.codigo = consecutivo;
    }

    public void editarProducto(String nombre, double existencias,
                               String unidad, double precio) {
        this.nombre = nombre;
        this.existencias = existencias;
        this.unidad = unidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getExistencias() {
        return existencias;
    }

    public void reducirExistencias(double cantidad) {
        existencias -= cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", existencias=" + existencias +
                ", unidad='" + unidad + '\'' +
                ", precio=" + precio +
                '}';
    }
}
