public class Main {
    public static void main(String[] args) {
        // Crear productos de prueba
        Producto producto1 = new Producto(1, "Producto 1", 10.0, 5);
        Electronico electronico1 = new Electronico(2, "Electronico 1", 20.0, 3, "Marca 1");
        Producto producto2 = new Producto(3, "Producto 2", 15.0, 2);

        //Nos creara la primera orden de agregar los productos.
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(electronico1);
        orden1.agregarProducto(producto2);

        //Nos mostrara los detalles de las ordenes
        orden1.mostrarDetalles();
    }
}
