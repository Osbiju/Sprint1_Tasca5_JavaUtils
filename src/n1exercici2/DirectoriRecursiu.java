package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoriRecursiu {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String ruta = "";

        //Aqui podriem posar una ruta:
        //C:\Users\Admin\Documents\SprintsJAVA_FINAL\Sprint1_Tasca5_JavaUtils\src

        //en el cas que no li proporcionem, preguntara.
        if (args.length == 0){
            System.out.println("Introdueix la ruta del directori que vols consultar: ");
            ruta = entrada.nextLine();
            File consulta = new File(ruta);

            if(consulta.exists() && consulta.isDirectory()){

                try {
                    llistarDirectoriRecursiu(ruta);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("La ruta no existeix");
            }
        }
    }

    public static void llistarDirectoriRecursiu(String ruta) throws FileNotFoundException {
        String ruta1 = "";

        //C:\Users\Admin\Documents\SprintsJAVA_FINAL\Sprint1_Tasca5_JavaUtils\src

        File carpeta = new File(ruta);

        File[] directori = carpeta.listFiles();
        SimpleDateFormat dataFormatejada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Arrays.sort(directori);

        for (int i = 0; i < directori.length; i++) {

            if(directori[i].isDirectory()){

                System.out.println("D: " + directori[i].getName() + " "
                        + ("Ultima modificacio: " + dataFormatejada.format(directori[i].lastModified())));

                ruta1 = directori[i].getAbsolutePath();

                llistarDirectoriRecursiu(ruta1);
            } else {
                System.out.println("F: " + directori[i].getName() + " "
                + ("Ultima modificacio: " + dataFormatejada.format(directori[i].lastModified())));
            }

        }

    }
}
