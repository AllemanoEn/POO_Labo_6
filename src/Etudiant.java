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

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        setMatricule(matricule);
    }

    public Etudiant(String nom, String prenom, int matricule, Groupe groupe){
        this(nom, prenom, matricule);
        setGroupe(groupe);
    }

    public String toString(){
        return "Etud. " + super.toString() + " (#" + getMatricule() + ") - " + groupe.toString() ;
    }
}
