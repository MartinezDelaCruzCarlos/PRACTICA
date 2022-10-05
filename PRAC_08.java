package prac_08;
import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_08 {

    public static void main(String[] args) {
        double descuento = 0;
        double montototal = 0;
        double venta = 0;
        String productos[] = {"Artefactos", "Plancha", "Licuadora", "Lavadora", "Cocina"};
        double precios[] = {140.0, 170.0, 150.0, 1500.0, 2000.0};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de la venta");
        venta = entrada.nextDouble();
        System.out.println("La venta es de: " + venta);
        if (venta >= 1200) {
            descuento = venta * 17 / 100;
        } else {
            if (venta >= 5000) {
                descuento = venta * .10;
            } else {
                if (venta < 5000) {
                    descuento = 0;
                }
            }
        }
        System.out.println("Lista de Productos y sus precios");
        for (int u = 0; u < productos.length; u++) {
            System.out.println(productos[u] + " " + precios[u] + " ");
        }
        System.out.println("El descuento es de: " + descuento);
        montototal = venta - descuento;
        System.out.println("El monto total de la venta es de: " + montototal);
    }
}

