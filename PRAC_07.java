package prac_07;
import java.util.Scanner;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_07 {

    public static void main(String[] args) {
        //7) Ingresar por teclado 5 notas y mostrar el promedio.
        Scanner dato = new Scanner(System.in);
        float notas[] = new float[6];
        int con = 1;
        float promedio, sum = 0;
        while (con < 6) {
            System.out.println("Ingrese la " + con + "° nota : ");
            notas[con] = dato.nextFloat();
            sum = sum + notas[con];
            con++;
        }
        promedio = sum / 5;
        System.out.println("Su promedio es : " + promedio);
    }

}

