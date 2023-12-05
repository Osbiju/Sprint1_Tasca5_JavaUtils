package n1exercici1_exercici2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        LlistarAlfabeticamentPerParametre llistat = new LlistarAlfabeticamentPerParametre();
        //ordenar la lista alfabeticamente
        llistat.Llistar(new File("C:\\Users\\Admin\\Documents\\SprintsJAVA_FINAL\\Sprint1_Tasca5_JavaUtils\\src\\n1exercici1_exercici2"));

        System.out.println();
        System.out.println("n1exercici2");
        System.out.println();

        File directorioActual = new File("C:\\Users\\Admin\\Documents\\SprintsJAVA_FINAL\\Sprint1_Tasca5_JavaUtils");

        // Llista l'arbre de directoris del directori actual
        llistat.llistarArbreDeDirectoris(directorioActual);



    }
}
