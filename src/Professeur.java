/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Professeur.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */


public class Professeur extends Personne {
    private String abreviation;
    private Lecon[] lecons;

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        setAbreviation(abreviation);
    }


    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String abreviation(){
        return this.abreviation;
    }

    public String toString(){
        return "Prof. " + super.toString() + " (" + abreviation() + ")";
    }

    public void definirLecons(Lecon ... lecons){
        this.lecons = lecons;
    }


    public String horaire(){
        return Lecon.horaire(lecons);
    }

}
