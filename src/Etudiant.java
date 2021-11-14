/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Etudiant.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              15.11.2021

But :               Definit la classe Etudiant, ses attributs et les méthodes qui lui sont possibles

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */

public class Etudiant extends Personne{
    private int matricule;
    private Groupe groupe;

    /**
     * Créer un étudiant
     * @param nom Nom de l'étudiant
     * @param prenom Prénom de l'étudiant
     * @param matricule Matricule de l'étudiant
     */
    public Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    /**
     * Définir le groupe d'un étudiant
     * @param groupe Groupe
     */
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    /**
     * Obtenir les infos de l'étudiant au format texte
     * @return Infos de l'étudiant au format Etud. [prenom] [nom] (#[matricule]) - [groupe]
     */
    public String toString(){
        return "Etud. " + super.toString() + " (#" + this.matricule + ") - " + groupe.nom() ;
    }
}
