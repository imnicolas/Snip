import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int opcion = 0;
        String data = "Anda a descansarrrrrrrrrr";
        File archivo = new File("texto.txt");
        FileReader leer = new FileReader(archivo);
        FileWriter escribir = new FileWriter(archivo,true);

        for (int i = 0; i< 5 ; i++){
            escribir.write(data);
        }

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de opciones\n\n"
                +"1. Leer archivo\n\n"
                        +"2. Crear archivo\n\n"
                +"3. Cerrar \n\n"));

                switch (opcion){
                    case 1 : int c = leer.read();
                        while (c != -1 ){
                            System.out.println((char)c);
                        }
                }

            }catch (NumberFormatException numberFormatException){
                System.out.println(numberFormatException.getMessage());
            }

        }while (opcion != 3);

    }

}