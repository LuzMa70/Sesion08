import java.util.InputMismatchException;
import java.util.Scanner;

// try-catch: Es un mecanismo de Java que permite "atrapar" o "controlar" los errores (excepciones)
// try: Es un bloque de código con líneas que potencialmente pueden generar una excepción
// catch: Si sucede una excepción, ¿qué hacemos con esa excepción?

public class WhileExp {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int primer = 0;
        int segundo = 0;
        boolean hayError = true;

        while (hayError) {
            System.out.println("Ingresa el primer número:");

            try {
                primer = sc.nextInt();
                hayError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Error al capturar el número, intenta de nuevo...");
            }

            sc.nextLine();
        }

        do {
            System.out.println("Ingresa el segundo número:");

            try {
                segundo = sc.nextInt();
                hayError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Error al capturar el número, intenta de nuevo...");
                hayError = true;
            }

            sc.nextLine();
        } while (hayError);

        int suma = primer + segundo;

        System.out.println("El resultado es: " + suma);

    }

}