// Clase Tienda
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos;

    // Constructor para inicializar la lista de productos
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    // Metodo para agregar un producto a la tienda
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Se añadió el producto '" + producto.getNombre() + "' a la tienda.");
    }

    // Metodo para listar todos los productos de la tienda
    public void listarProductos() {
        System.out.println("\n--- Productos en la Tienda ---");
        if (productos.isEmpty()) {
            System.out.println("La tienda no tiene productos disponibles.");
            return;
        }
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio() + ", Disponible: " + producto.getCantidadDisponible());
        }
        System.out.println("-----------------------------\n");
    }

    // Metodo para buscar un producto por nombre
    public Producto buscarProducto(String nombre) {
        for (Producto producto : this.productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto
    }
}