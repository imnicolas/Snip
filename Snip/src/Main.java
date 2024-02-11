
import javax.swing.*;
import java.io.IOException;

public class
Main {

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu" +
                        "\n1. Leemos ? " +
                        "\n2. Escribo ?" +
                        "\n3. gg" +
                        "\n4. Retirada Estrategica"));

                switch (opcion) {
                    case 1:// Lectura y reproduccion del archivo
                    {
                        leer();
                    }
                    break;
                    case 2:// Escribo el archivo ;
                    {
                        String data = JOptionPane.showInputDialog(null, "que queres escribir?");
                        Objetos.getEscribir().write("\t" + data);
                        Objetos.getEscribir().close();
                    }
                    break;
                    case 3: {
                        System.out.println("nadapor aqui y por alla ?");
                    }
                    break;
                    default:
                        System.out.println("Gg nico");
                }
            } catch (NumberFormatException e) {

            }

        } while (opcion != 4);
    }

    public static void leer() throws IOException {
        int c = Objetos.getLeer().read();
        char x ;
        while (c != -1) {
            c = Objetos.getLeer().read();
            x = (char)c;
            System.out.print(x);
        }
    }

}