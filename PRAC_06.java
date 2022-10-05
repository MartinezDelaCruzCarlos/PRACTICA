package prac_06;
import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_06 {

    public static void main(String[] args) {
        //6) Ingresar 10 números enteros y mostrar los números pares.
        Scanner dato = new Scanner(System.in);
        int par[] = new int[10];
        int valor[] = new int[10];
        int contador = 0;
        int i;
        System.out.println("Ingrese los 10 números a evaluar");
        for (i = 0; i < 10; i++) {
            par[i] = dato.nextInt();
            if (par[i] % 2 == 0) {
                valor[contador] = par[i];
                contador++;
            }
        }
        System.out.println("los numeros pares son : ");
        for (i = 0; i < contador; i++) {
            System.out.println(valor[i]);
        }
    }

}

