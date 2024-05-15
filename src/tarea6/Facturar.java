package tarea6;

/**
 *
 * @author Buen examen a todos
 */
public class Facturar {
    private static final int LIMITE_PARA_DESCUENTO = 3;
    private static final double DESCUENTO_BASIC = 0.95;
    private static final double DESCUENTO_PRIME = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {

        double total;
        if (numProductos > LIMITE_PARA_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos > 50) {
            total = precioProducto * DESCUENTO_PRIME;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BASIC;
            mostrarTotal(total);
        }

    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
