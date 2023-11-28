package n1exercici1;

import java.io.File;
import java.util.Arrays;


public class LlistarAlfabeticamentPerParametre {


    public void Llistar(File directorio) {

        File[] archivos = directorio.listFiles();

        if (archivos == null || archivos.length == 0){

            System.out.println("Archivo no encontrado");
            return;

        }
        Arrays.sort(archivos);

        for (File archivo : archivos){
            //System.out.println(directorio.getAbsolutePath()  + archivo.getName()); no es correcte aixi...
            System.out.println(archivo.getAbsolutePath());
        }
    }

    //n1exercici2
    //funcio encarregada de llistar l'arbre de directoris d'un directori donat
    public void llistarArbreDeDirectoris(File directorio) {
        //TODO
        if (directorio.listFiles() == null){
            System.out.println("Directorio no encontrado");
            return;

        }
        //imprimir directori actual


        for(File archivo : directorio.listFiles()){
            if(archivo.isDirectory()){
                System.out.println("(D)" + directorio.getAbsolutePath());
                llistarArbreDeDirectoris(archivo);
            }else{
                System.out.println("(F)" + archivo.getAbsolutePath());
            }


        }



    }


}
