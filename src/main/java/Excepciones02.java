import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int primer = 0;

        int segundo = 0;

        boolean hayError = true;

        while (hayError) {

            System.out.println("Ingresa el primer numero:");

            try {

                primer = sc.nextInt();

                hayError = false;

            } catch (InputMismatchException ex) {

                System.out.println("Error al capturar el numero, intenta de nuevo...");

            }

            sc.nextLine();

        }

        do {

            System.out.println("Ingresa el segundo numero:");

            try {

                segundo = sc.nextInt();

                hayError = false;

            } catch (InputMismatchException ex) {

                System.out.println("Error al capturar el numero, intenta de nuevo...");

                hayError = true;

            }

            sc.nextLine();

        } while (hayError);

        int suma = primer + segundo;

        System.out.println("El resultado es: "+suma);

    }

}