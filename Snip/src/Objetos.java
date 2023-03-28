import java.io.*;

public class Objetos {

    private static File archivo = new File("texto.txt");
    private static FileWriter escribir;
    static {
        try {
            escribir = new FileWriter(archivo, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static FileReader leer;
    static {
        try {
            leer = new FileReader(archivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Objetos() {
    }

    public static File getArchivo() {
        return archivo;
    }

    public static void setArchivo(File archivo) {
        Objetos.archivo = archivo;
    }

    public static FileWriter getEscribir() {
        return escribir;
    }

    public static void setEscribir(FileWriter escribir) {
        Objetos.escribir = escribir;
    }

    public static FileReader getLeer() {
        return leer;
    }

    public static void setLeer(FileReader leer) {
        Objetos.leer = leer;
    }

}
