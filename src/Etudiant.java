/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Etudiant.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */

public class Etudiant extends Personne{
    private int matricule;
    private Groupe groupe;

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }



    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    public String toString(){
        return "Etud. " + super.toString() + " (#" + this.matricule + ") - " + groupe.nom() ;
    }
}
