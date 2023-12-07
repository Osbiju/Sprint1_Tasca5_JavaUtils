package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiuA_Text {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String ruta = "";

        if (args.length == 0){
            System.out.println("Introdueix la ruta del directori que vols mirar");
            ruta = entrada.nextLine();
            File consulta = new File(ruta);

            if(consulta.exists() && consulta.isDirectory()){
                try {
                    llistarDirectoriA_Text(ruta);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("El fitxer .text s'ha creat correctament");

            }else{
                System.out.println("La ruta no existeix");
            }
        }
    }

    public static void llistarDirectoriA_Text(String ruta) throws FileNotFoundException {
        String ruta1 = "";

        File carpeta = new File(ruta);

        File[] directori = carpeta.listFiles();
        SimpleDateFormat dataFormatejada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Arrays.sort(directori);

        for (int i = 0; i < directori.length; i++) {

            if(directori[i].isDirectory()){

                System.out.println("D: " + directori[i].getName() + " "
                        + ("Ultima modificacio: " + dataFormatejada.format(directori[i].lastModified())));

                ruta1 = directori[i].getAbsolutePath();

                llistarDirectoriA_Text(ruta1);

            } else {

                if(directori[i].getName().endsWith(".txt")){

                    System.out.println("F: " + directori[i].getName() + " "
                            + ("Ultima modificacio: " + dataFormatejada.format(directori[i].lastModified())));
                }
            }
        }

    }
}
