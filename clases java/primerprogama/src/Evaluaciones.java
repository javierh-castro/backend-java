import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones  =  0;


        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextInt();

            if (nota != -1) {//Esto es para que no sume el numero -1 para sacar la media
            mediaEvaluaciones += nota;
            totalEvaluaciones++;
            }
        }

        System.out.println("La media de evaluacione para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
