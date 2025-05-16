// Clase principal para simular la compra
public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto Pantalon = new Producto("Pantalon", 1200.00, 10);
        Producto Camisa = new Producto("Camisa", 25.00, 50);
        Producto zapato = new Producto("zapato", 75.00, 25);

        // Crear una tienda
        Tienda miTienda = new Tienda();

        // Agregar productos a la tienda
        miTienda.agregarProducto(Pantalon);
        miTienda.agregarProducto(Camisa);
        miTienda.agregarProducto(zapato);

        // Listar los productos en la tienda
        miTienda.listarProductos();

        // Crear un cliente
        Cliente cliente1 = new Cliente("Ana Pérez", "ana.perez@email.com");

        // Simular una compra
        String productoDeseado = "Pantalon";
        int cantidadDeseada = 2;

        Producto productoParaComprar = miTienda.buscarProducto(productoDeseado);

        if (productoParaComprar != null) {
            System.out.println("\n" + cliente1.nombre + " quiere comprar " + cantidadDeseada + " unidades de '" + productoParaComprar.getNombre() + "'.");
            if (productoParaComprar.getCantidadDisponible() >= cantidadDeseada) {
                productoParaComprar.vender(cantidadDeseada);
                cliente1.agregarAlHistorial(productoParaComprar.getNombre() + " (x" + cantidadDeseada + ")");
            } else {
                System.out.println("Lo sentimos, no hay suficiente stock de '" + productoParaComprar.getNombre() + "'.");
            }
        } else {
            System.out.println("El producto '" + productoDeseado + "' no se encontró en la tienda.");
        }

        // Mostrar el historial de compras del cliente
        cliente1.mostrarHistorial();
    }
}