/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Groupe.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              15.11.2021

But :               Definit la classe Groupe, ses attributs et les méthodes qui lui sont possibles

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

    /**
     *  Créer un groupe
     * @param numero Numéro du groupe
     * @param orientation Orientation du groupe
     * @param trimestre Trimestre du groupe
     */
    public Groupe(int numero, String orientation, int trimestre) {
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
    }

    /**
     * Obtenir le nom du groupe
     * @return Le nom du groupe au format [orientation][numero]-[trimestre], exemple : IL6-1
     */
    public String nom(){
        return orientation + numero + "-" + trimestre;
    }

    /**
     * Obtenir le nombre d'étudiants du groupe
     * @return Le nombre d'étudiants
     */
    public int nombreEtudiants(){
        return nbEtudiants;
    }

    /**
     * Definir les lecons suivies par le groupe
     * @param lecons Tableau des leçons suivies par le groupe
     */
    public void definirLecons(Lecon ... lecons){
        this.lecons = lecons;
    }

    /**
     * Definir les étudiants membres du groupe
     * @param etudiants Etudiants du groupe
     */
    public void definirEtudiants(Etudiant ... etudiants){
        this.etudiants = etudiants;
        nbEtudiants = etudiants.length;
    }

    /**
     * Obtenir l'horaire
     * @return Horaire du groupe en 2 dimensions au format texte
     */
    public String horaire(){
        return "\n-- Horaire du groupe " + nom() + " (" + nombreEtudiants()
                + " étudiants)\n\n" + Lecon.horaire(lecons);
    }
}
