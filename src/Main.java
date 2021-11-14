/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Main.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */
public class Main {

    public static String afficherCalendrier() {
        return null;
    }

    public static void main(String [] args) {
        Professeur Donini = new Professeur("Donini", "Pier", "PDO");
        Professeur Evequoz = new Professeur("Evequoz", "Claude", "CEZ");

        Lecon POO1_1 = new Lecon("POO1", 2, 2, 2, "G02", Donini);
        Lecon POO1_2 = new Lecon("POO1", 2, 5, 2, "H01", Donini);
        Lecon POO1_3 = new Lecon("POO1", 3, 2, 2, "G03", Donini);

        Lecon PLP_1 = new Lecon("PLP", 2, 7, 2, "H01", Evequoz);

        Lecon TIC_1 = new Lecon("TIC", 1, 9, 1, "F06");

        Donini.definirLecons(POO1_1, POO1_2, POO1_3);
        Evequoz.definirLecons(PLP_1);

        Etudiant Lennon = new Etudiant("Lennon", "John", 1234);
        Etudiant McCartney = new Etudiant("Mc Cartney", "Paul", 2341);
        Etudiant Starr = new Etudiant("Starr", "Ringo", 3241);
        Etudiant Harrison = new Etudiant("Harrison", "Georges", 4321);
        Etudiant Waters = new Etudiant("Waters", "Roger", 1324);
        Etudiant Gilmour = new Etudiant("Gilmour", "David", 4312);

        Groupe IL6_1 = new Groupe(6, "IL", 1);
        Groupe TS6_1 = new Groupe(6, "TS", 1);

        Lennon.setGroupe(IL6_1);
        McCartney.setGroupe(IL6_1);
        Starr.setGroupe(IL6_1);
        Harrison.setGroupe(IL6_1);
        IL6_1.definirEtudiants(Lennon, McCartney, Starr, Harrison);

        Waters.setGroupe(TS6_1);
        Gilmour.setGroupe(TS6_1);
        TS6_1.definirEtudiants(Waters, Gilmour);

        IL6_1.definirLecons(POO1_1, POO1_2, POO1_3, PLP_1, TIC_1);
        TS6_1.definirLecons(POO1_1, POO1_2, POO1_3);

        /*Personne[] personnes = {Donini, Evequoz, Lennon, McCartney, Starr, Harrison, Waters, Gilmour};

        System.out.println("-- Membres de l'ecole");

        for(Personne personne : personnes){
            System.out.println(personne);
        }*/

        System.out.println(IL6_1.horaire());
        // System.out.println(Donini.horaire());


    }
}
