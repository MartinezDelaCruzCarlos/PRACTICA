package prac_10;
import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_10 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros ");
        int elementos = dato.nextInt();
        int[] n = new int[elementos];
        System.out.println("Ingrese números a ordenar ");
        for (int a = 0; a < n.length; a++) {
            n[a] = dato.nextInt();
        }
        int orden = 0;
        for (int b = 1; b < n.length; b++) {
            for (int c = 0; c < n.length - b; c++) {
                if (n[c] > n[c + 1]) {
                    orden = n[c];
                    n[c] = n[c + 1];
                    n[c + 1] = orden;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println(" ");
    }
}


