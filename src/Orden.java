import java.util.ArrayList;
public class Orden {
    private ArrayList<Producto> productos;
    public Orden() {
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    public void mostrarDetalles() {
        for (Producto producto : productos) {
            System.out.println(" ");
            System.out.println("ID: " + producto.getId());
            System.out.println("----------");
            System.out.println("Nombre del Producto: " + producto.getNombre());
            System.out.println("Precio del Producto: " + producto.getPrecio());
            System.out.println("Cantidad del Producto: " + producto.getCantidad());
            if (producto instanceof Electronico) {
                Electronico electronico = (Electronico) producto;
                System.out.println("Marca: " + electronico.getMarca());
                System.out.println("Precio con el descuento: " + electronico.calcularDescuento());
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Total: " + calcularTotal());
    }
}
