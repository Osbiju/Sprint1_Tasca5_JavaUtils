package n1exercici3;

import java.io.*;
import java.util.Arrays;
import java.util.Date;



public class GuardarEnFitxer {


    public void Llistar(File directorio) {

        File[] archivos = directorio.listFiles();

        if (archivos == null || archivos.length == 0){

            System.out.println("Archivo no encontrado");
            return;

        }
        Arrays.sort(archivos);

        //crea el fitxer de sortida
        FileWriter fitxerSortida = null;
        try {
            fitxerSortida = new FileWriter("llistat.txt");
        } catch (Exception e) {
            System.out.println("Error al crear el fitxer de sortida");
            return;
        }

        //escriu el resultat al fitxer
        for (File archivo : archivos){
            try {
                fitxerSortida.write(archivo.getAbsolutePath() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //tanca el fitxer
        try {
            fitxerSortida.close();
        } catch (Exception e) {
            System.out.println("Error al tancar el fitxer de sortida");
        }
    }


    //funcio encarregada de llistar l'arbre de directoris d'un directori donat
    public void llistarArbreDeDirectoris(File directorio) {
        //TODO
        if (directorio.listFiles() == null){
            System.out.println("Directorio no encontrado");
            return;

        }
        //imprimir directori actual


        for(File archivo : directorio.listFiles()){
            long lastModified = archivo.lastModified();
            if(archivo.isDirectory()){
                System.out.println("(D)" + directorio.getAbsolutePath());
                llistarArbreDeDirectoris(archivo);
            }else{
                System.out.println("(F)" + archivo.getAbsolutePath() + "  Ultima modificacio:  " +  new Date(lastModified) );
            }



        }


    }
    //afegir funcionalitat de llegir qualsevol fitxer TXT i mostrar contingut per consola




}