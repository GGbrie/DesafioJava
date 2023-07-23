public class Electronico extends Producto {
    private String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public double calcularDescuento() {
        //Se le aplicara el descuento a los productos
        return getPrecio() * 0.9;
    }
}