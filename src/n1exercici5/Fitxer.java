package n1exercici5;

import java.io.Serializable;

public class Fitxer implements Serializable {

    private String nom;
    private String tipus;
    private String dataModificacio;

    public Fitxer(String nom, String tipus, String dataModificacio) {
        this.nom = nom;
        this.tipus = tipus;
        this.dataModificacio = dataModificacio;
    }

    public String getNom() {
        return nom;
    }

    public String getTipus() {
        return tipus;
    }

    public String getDataModificacio() {
        return dataModificacio;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setDataModificacio(String dataModificacio) {
        this.dataModificacio = dataModificacio;
    }

    @Override
    public String toString() {
        return "Fitxer [nom=" + nom + ", tipus=" + tipus + ", dataModificacio=" + dataModificacio + "]";
    }

}
