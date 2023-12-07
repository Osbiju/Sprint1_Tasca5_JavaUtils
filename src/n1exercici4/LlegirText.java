package n1exercici4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class LlegirText {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String ruta = "";


        if (args.length == 0) {
            System.out.println("Introdueix la ruta del directori que vols consultar: ");
            ruta = entrada.nextLine();
            File consulta = new File(ruta);

            if (consulta.exists() && consulta.isDirectory()) {

                llistarDirectorioRecursiu(ruta);
                System.out.println("El fitxer .txt s'ha creat correctament");

            } else if (consulta.exists() && consulta.isFile()) {
                llegirText(consulta);
            } else {
                System.out.println("La ruta no existeix");
            }
        }

    }

    public static void llegirText(File consulta) {

        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader(consulta));

            String linea;

            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {

            System.err.println(e.getMessage());

        }finally {

            try {

                lector.close();

            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }

    public static void fitxer_a_text(String fitxer) {

        try (FileWriter llistaFitxers = new FileWriter("fitxer.txt", true)) {

            llistaFitxers.write(fitxer + "\n");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void llistarDirectorioRecursiu(String ruta) {

        File carpeta = new File(ruta);

        if (carpeta.isDirectory()) {

            File[] directorio = carpeta.listFiles();
            SimpleDateFormat dataFormatejada = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

            Arrays.sort(directorio);

            for (int i = 0; i < directorio.length; i++) {

                if (directorio[i].isDirectory()) {

                    fitxer_a_text("D:" + directorio[i].getName() + " "
                            + ("Ultima modificacio: " + dataFormatejada.format(directorio[i].lastModified())));

                    String ruta1 = directorio[i].getAbsolutePath();

                    llistarDirectorioRecursiu(ruta1);

                } else {

                    fitxer_a_text("F:" + directorio[i].getName() + " "
                            + ("Ultima modificacio: " + dataFormatejada.format(directorio[i].lastModified())));
                }

            }

        } else {

            System.err.println("El directori no es valid.");
        }
    }


}
