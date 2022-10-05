package prac_05;
import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_05 {

    public static void main(String[] args) {
        /*5) Crear un arreglo, que nos pida ingresar una palabra,
        para mostrarlo letra por letra y la suma de sus caracteres.*/
        Scanner dato = new Scanner(System.in);
        int c = 0;
        System.out.println("Escriba una palabra");
        String palabra = dato.nextLine();
        char caracteres[] = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            c = c + 1;
            caracteres[i] = palabra.charAt(i);
            System.out.println(caracteres[i]);
        }
        System.out.println("la cantidad de caracteres es : " + c);
    }

}

