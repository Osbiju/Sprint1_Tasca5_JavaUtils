package n1exercici3;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        GuardarEnFitxer llistat = new GuardarEnFitxer();
        //ordenar la lista alfabeticamente
        llistat.Llistar(new File("C:\\Users\\formacio\\Documents\\Osbiju\\Sprint1_Tasca5_JavaUtils\\"));

        System.out.println();
        System.out.println("n1exercici2");
        System.out.println();

        File directorioActual = new File("C:\\Users\\formacio\\Documents\\Osbiju");

        // Llista l'arbre de directoris del directori actual
        llistat.llistarArbreDeDirectoris(directorioActual);



    }
}
