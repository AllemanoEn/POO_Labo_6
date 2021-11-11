/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Professeur.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Professeur extends Personne {
    private String abreviation;

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        setAbreviation(abreviation);
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String abreviation(){
        throw new NotImplementedException();
    }

    public String toString(){
        return "Prof. " + super.toString() + " (" + getAbreviation() + ")";
    }

    public String horaire(){
        throw new NotImplementedException();
    }

}
