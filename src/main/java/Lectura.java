/*import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

// Esto funciona de manera "local"
// File: Es la referencia de un archivo
// FileReader: Establece conexión con el archivo
// BufferedReader: Permite extraer los datos (binario) del archivo

public class Lectura {

    public static void main(String [] args) {

        try {
            File java = new File("./src/main/java/importante");
            FileReader conexion = new FileReader(java);
            BufferedReader lector = new BufferedReader(conexion);

        } catch (FileNotFoundException fnex) {
            System.out.println("ERROR: El archivo no existe o no se puede abrir");
        }
    }
}
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

// Esto funciona de manera "local"
// File: Es la referencia de un archivo
// FileReader: Establece conexión con el archivo
// BufferedReader: Permite extraer los datos (binario) del archivo

// Exception -> IOException -> FileNotFoundException


public class Lectura {

    public static void main(String [] args) {

        try {
            File java = new File("./src/main/java/importante");
            FileReader conexion = new FileReader(java);
            BufferedReader lector = new BufferedReader(conexion);

            String linea = lector.readLine();

            System.out.println("Linea 1: " + linea);

            linea = lector.readLine();

            System.out.println("Linea 2: " + linea);

            lector.close();
        } catch (FileNotFoundException fnex) {
            System.out.println("ERROR: No se encontro el archivo...");
        } catch (IOException ioex) {
            System.out.println("ERROR: No se pudo leer el archivo...");
        } catch (Exception ex) {
            System.out.println("ERROR: Ocurrio un error inesperado...");
        }
    }
}