/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Lecon.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Lecon {

    private String matiere;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String salle;
    private Professeur professeur;

    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
    }
    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle, Professeur professeur){
        this(matiere, jourSemaine, periodeDebut, duree, salle);
        this.professeur = professeur;
    }


    public String horaire(String ... args){
        throw new NotImplementedException();
    }
}
