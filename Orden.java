package POO_Tienda;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Orden {
    private static int consecutivoGlobal = 1;

    private int consecutivo;
    private String estado;
    private LocalDateTime fecha;
    private ArrayList<Linea> lineas;

    public Orden(String estado) {
        this.consecutivo = consecutivoGlobal++;
        this.estado = estado;
        this.fecha = LocalDateTime.now();
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(Linea linea) {
        lineas.add(linea);
    }

    public void borrarLinea(int indice) {
        if (indice >= 0 && indice < lineas.size()) {
            lineas.remove(indice);
        }
    }

    public double calcularCosto() {
        double total = 0;
        for (Linea linea : lineas) {
            total += linea.calcularSubtotal();
        }

        return total;
    }

    public double calcularImpuesto() {
        return calcularCosto() * 0.13;
    }

    public double calcularTotal() {
        return calcularCosto() + calcularImpuesto();
    }

    public void detalle() {
        System.out.println(this);
        for (Linea linea : lineas) {
            System.out.println(linea);
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "consecutivo=" + consecutivo +
                ", estado='" + estado + '\'' +
                ", fecha=" + fecha +
                ", total=" + calcularTotal() +
                '}';
    }
}
