public class Main {
    public static void main(String [] args) {
        Professeur Donini = new Professeur("Donini", "Pier", "PDO");
        Professeur Evequoz = new Professeur("Evequoz", "Claude", "CEZ");

        Lecon POO1_1 = new Lecon("POO1", 2, 2, 2, "G02", Donini);
        Lecon POO1_2 = new Lecon("POO1", 2, 5, 2, "H01", Donini);
        Lecon POO1_3 = new Lecon("POO1", 3, 2, 2, "G03", Donini);

        Lecon PLP_1 = new Lecon("PLP", 2, 7, 2, "H01", Evequoz);

        Lecon TIC_1 = new Lecon("TIC", 1, 9, 1, "F06");

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

        Waters.setGroupe(TS6_1);
        Gilmour.setGroupe(TS6_1);

        IL6_1.definirLecons(POO1_1, POO1_2, POO1_3, PLP_1, TIC_1);
        TS6_1.definirLecons(POO1_1, POO1_2, POO1_3);

        Personne[] personnes = {Donini, Evequoz, Lennon, McCartney, Starr, Harrison, Waters, Gilmour};

        for(Personne personne : personnes){
            System.out.println(personne);

        }





    }
}
