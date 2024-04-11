import java.util.InputMismatchException;
import java.util.Scanner;

// try-catch: Es un mecanismo de Java que permite "atrapar" o "controlar" los errores (excepciones)
// try: Es un bloque de código con líneas que potencialmente pueden generar una excepción
// catch: Si sucede una excepción, ¿qué hacemos con esa excepción?

public class ErrorExcepcion {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");

        int primer = 0;

        try {
            primer = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Error al capturar un número en la primer entrada!");
        }
        sc.nextLine();


        System.out.println("Ingresa el segundo número:");


        int segundo = sc.nextInt();
        sc.nextLine();

        int suma = primer + segundo;

        System.out.println("El resultado es: " + suma);
    }

}