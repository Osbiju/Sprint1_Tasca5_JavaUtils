package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoriOrdenatAlfabeticament {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String ruta = "";

        if (args.length == 0){
            System.out.println("Introdueix la ruta del directori que vols mirar");
            ruta = entrada.nextLine();

            try {
                directoriOrdenat(ruta);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("La ruta no existeix");
        }



    }

    public static void directoriOrdenat(String ruta) throws FileNotFoundException {

        //llegim la ruta:
        File carpeta = new File(ruta);

        File [] directori;

        if (carpeta.exists()){
            directori = carpeta.listFiles();
            Arrays.sort(directori);

            for (File file : directori) {
                System.out.println(file);
            }
        } else {
            System.out.println("La ruta no es la correcta");
        }
    }
}
