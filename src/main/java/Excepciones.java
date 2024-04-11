
import java.util.Scanner;
// Scanner: Es una clase que nos permite tener datos de entrada
// por parte del usuario

public class Excepciones {

    // Este método es el que permite ejecutar el código
    public static void main(String [] args) {

        // Creando una nueva instancia (objeto) de la clase Scanner
        // dándole como parámetro "System.in"
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        // nextInt() captura y transforma un dato en un número entero
        // sc.nextBoolean(); -> captura y transforma en booleano
        // sc.nextDouble(); -> captura y transforma en double (punto flotante)
        // sc.nextLine(); -> captura y transforma en un String

        int primer = sc.nextInt();
        // Limpiar la entrada
        sc.nextLine();


        System.out.println("Ingresa el segundo número:");
        int segundo = sc.nextInt();
        sc.nextLine();

        int suma = primer + segundo;

        // Concatenación: Tomar una cadena de texto (String) y pegarle valores
        System.out.println("El resultado es: " + suma);
    }

}
