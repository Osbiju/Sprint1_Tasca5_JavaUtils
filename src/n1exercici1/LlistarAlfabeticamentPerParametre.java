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
            System.out.println(directorio.getAbsolutePath() + archivo.getName());
        }


    }


}
