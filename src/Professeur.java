/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Professeur.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              15.11.2021

But :               Definit la classe Professeur, ses attributs et les méthodes qui lui sont possibles

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */


public class Professeur extends Personne {
    private String abreviation;
    private Lecon[] lecons;

    /**
     * Créer un professeur
     * @param nom Nom du professeur
     * @param prenom Prénom du professeur
     * @param abreviation Abréviation du professeur
     */
    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        this.abreviation = abreviation;
    }

    /**
     * Obtenir l'abréviation du professeur
     * @return L'abérviation du professeur
     */
    public String abreviation(){
        return this.abreviation;
    }

    /**
     * Obtenir les infos du professeur au format texte
     * @return Infos du professeur au format Prof. [prenom] [nom] ([abreviation])
     */
    public String toString(){
        return "Prof. " + super.toString() + " (" + abreviation() + ")";
    }

    /**
     * Definir les leçons du professeur
     * @param lecons Tableau des leçons
     */
    public void definirLecons(Lecon ... lecons){
        this.lecons = lecons;
    }


    /**
     * Obtenir l'horaire
     * @return L'horaire du professeur en 2 dimensions au format texte
     */
    public String horaire(){
        return "\n-- Horaire " + toString() + "\n\n" + Lecon.horaire(lecons);
    }

}
