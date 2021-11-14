/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Personne.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              15.11.2021

But :               Definit la classe abstraite Personne, ses attributs et les méthodes qui lui sont possibles

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */

public abstract class Personne {
    private String nom;
    private String prenom;

    /**
     * Créer une personne
     * @param nom Nom de la personne
     * @param prenom Prénom de la personne
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Obtenir les infos d'une personne au format texte
     * @return Infos de la personne au format [nom] [prenom]
     */
    public String toString(){
        return this.prenom + " " + this.nom;
    }
}
