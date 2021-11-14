/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Groupe.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */

public class Groupe {
    private final int numero;
    private final String orientation;
    private final int trimestre;
    private Lecon[] lecons;
    private Etudiant[] etudiants;
    private int nbEtudiants = 0;

    public Groupe(int numero, String orientation, int trimestre) {
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
    }

    public String nom(){
        return orientation + numero + "-" + trimestre;
    }

    public int nombreEtudiants(){
        return nbEtudiants;
    }

    public void definirLecons(Lecon ... lecons){
        this.lecons = lecons;
    }

    public void definirEtudiants(Etudiant ... etudiants){
        this.etudiants = etudiants;
        nbEtudiants = etudiants.length;
    }

    public String horaire(){
        return Lecon.horaire(lecons);
    }
}
