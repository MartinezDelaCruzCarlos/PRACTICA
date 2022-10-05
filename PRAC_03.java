package prac_03;
/*
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class PRAC_03 {

    public static void main(String[] args) {
        //3) Mostrar el promedio de notas de tres cursos.
        String cursos[] = {"Diseño", "Estadistica", "Ingles"};
        int practicas[] = {14, 17, 11};
        System.out.println("Promedio de Cursos");
        System.out.println("CURSO NOTA");
        System.out.println("------ ----- ");
        int pp = (practicas[0] + practicas[1] + practicas[2]) / 3;
        for (int s = 0; s < cursos.length; s++) {
            System.out.println(cursos[s] + " " + practicas[s]);
        }
        System.out.println("Su Promedio es : " + pp);
    }
}

