
import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu" +
                        "\n1. Leer archivo ?" +
                        "\n2. Escribir archivo ?" +
                        "\n3. Cerrar el chiringuito"));

                switch (opcion) {
                    case 1:// Lectura y reproduccion del archivo
                    {
                        leer();
                    }
                    break;
                    case 2:// Escribo el archivo ;
                    {
                        String data = JOptionPane.showInputDialog(null, " que queres escribir? ");
                        Objetos.getEscribir().write("\t" + " " + data);
                        Objetos.getEscribir().close();
                    }
                    break;
                    default:
                        System.out.println(" Gg nico ");
                }
            } catch (NumberFormatException e) {

            }

        } while (opcion != 3);
    }

    public static void leer() throws IOException {
        int c = Objetos.getLeer().read();
        while (c != -1) {
            c = Objetos.getLeer().read();
            System.out.print((char) c);
        }
    }

}