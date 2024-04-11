import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Escritura {

    public static void main(String [] args) {

        try {
            // Establecer conexion con un archivo y voy a escribir en una codificación que acepta acentos
            // Si no existe el archivo, lo crea
            // Si yo quiero CONSERVAR EL CONTENIDO DEL ARCHIVO, pongo true como último parámetro
            FileWriter conexion = new FileWriter("./src/main/java/nuevo.txt", Charset.forName("utf-8")); // Sobreescribe todo
            // FileWriter conexion = new FileWriter("./archivos/nuevo.txt", Charset.forName("utf-8"), true); // Dejar lo existente
            BufferedWriter escritor = new BufferedWriter(conexion);

            escritor.write("¡Hola Mundo!");
            escritor.newLine();
            escritor.write("¿Cómo están?");

            escritor.close();
        } catch (IOException ioex) {
            System.out.println("ERROR: No se pudo escribir en un archivo");
        }
    }
}