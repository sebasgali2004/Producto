// Clase Producto
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor para inicializar los atributos del producto
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Metodo para vender cierta cantidad del producto
    public void vender(int cantidad) {
        // Control: Verificar que haya suficiente cantidad disponible para la venta
        if (cantidad <= this.cantidadDisponible && cantidad > 0) {
            this.cantidadDisponible -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + this.nombre + ". Cantidad disponible: " + this.cantidadDisponible);
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que cero.");
        }
        else {
            System.out.println("No hay suficiente stock de " + this.nombre + " para vender " + cantidad + " unidades.");
        }
    }

    // Metodo para reabastecer el stock del producto
    public void reabastecer(int cantidad) {
        // Control: Verificar que la cantidad a reabastecer sea positiva
        if (cantidad > 0) {
            this.cantidadDisponible += cantidad;
            System.out.println("Se reabastecieron " + cantidad + " unidades de " + this.nombre + ". Nueva cantidad disponible: " + this.cantidadDisponible);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor que cero.");
        }
    }

    // Métodos getter para acceder a los atributos (son buena práctica)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}

