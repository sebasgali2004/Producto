// Clase Cliente
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;         // Atributo público
    private String correo;        // Atributo privado
    protected List<String> historialDeCompras; // Atributo protegido

    // Constructor para inicializar los atributos del cliente
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.historialDeCompras = new ArrayList<>();
    }

    // Metodo público para agregar un producto al historial de compras
    public void agregarAlHistorial(String producto) {
        this.historialDeCompras.add(producto);
        System.out.println(this.nombre + " añadió '" + producto + "' al historial de compras.");
    }

    // Metodo privado (solo accesible dentro de la clase Cliente) para obtener información de contacto
    private String obtenerInformacionContacto() {
        return "Nombre: " + this.nombre + ", Correo: " + this.correo;
    }

    // Metodo protegido (accesible dentro de la clase y sus subclases, y clases en el mismo paquete)
    protected void mostrarHistorial() {
        System.out.println("Historial de compras de " + this.nombre + ": " + this.historialDeCompras);
    }

    // Metodo público para mostrar la información de contacto (accede al metodo privado)
    public void mostrarInfo() {
        System.out.println(obtenerInformacionContacto());
    }
}