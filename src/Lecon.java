/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Lecon.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              15.11.2021

But :               Definit la classe Lecon, ses attributs et les méthodes qui lui sont possibles.
                    Définit également la méthode statique permettant de générer un horaire au format texte.

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */

public class Lecon {

    private String matiere;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String salle;
    private Professeur professeur;

    /**
     * Créer une leçon sans professuer
     * @param matiere Matière de la leçon
     * @param jourSemaine Jour de la leçon
     * @param periodeDebut Préiode de début de la leçon
     * @param duree Durée de la leçon
     * @param salle Salle de la leçon
     */
    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
    }

    /**
     * Créer une leçon avec un professeur
     * @param matiere Matière de la leçon
     * @param jourSemaine Jour de la leçon
     * @param periodeDebut Préiode de début de la leçon
     * @param duree Durée de la leçon
     * @param salle Salle de la leçon
     * @param professeur Professeur de la leçon
     */
    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle, Professeur professeur){
        this(matiere, jourSemaine, periodeDebut, duree, salle);
        this.professeur = professeur;
    }

    /**
     * Méthode statique de génération d'un calendrier au format texte d'un tableau de leçons.
     * @param lecons Tableau de leçons
     * @return Horaire des leçons au format texte
     */
    public static String horaire(Lecon ... lecons){
        StringBuilder calendrier = new StringBuilder();
        StringBuilder ligneCourante = new StringBuilder();
        boolean afficherCelluleVide = true;
        boolean afficheFinDePeriode = true;
        String[] periode = new String[]{"8:30","9:15","10:25","11:15","12:00","13:15",
                                        "14:00","14:55","15:45","16:35","17:20"};
        calendrier.append(String.format("%76s","| Lun         | Mar         | Mer         " +
                                               "| Jeu         | Ven         |")).append("\n");
        calendrier.append(String.format("%76s","|-------------|-------------|-------------" +
                                               "|-------------|-------------|")).append("\n");

        for (int i = 0; i < 11;++i){
            ligneCourante.append(String.format("%5s",periode[i]));
            for (int j = 0; j < 5;++j){
                ligneCourante.append("|");

                for (Lecon l : lecons){
                    if (l.jourSemaine == j && l.periodeDebut == i){
                        ligneCourante.append(String.format("%-5s %s", l.matiere ,
                                l.salle + (l.professeur == null ? "    " : " "
                                        + l.professeur.abreviation())));
                        afficherCelluleVide = false;
                    }
                }

                if(afficherCelluleVide){
                    ligneCourante.append(String.format("%13s", " "));
                }

                afficherCelluleVide = true;

            }
            ligneCourante.append("|\n");
            ligneCourante.append(String.format("%5s"," "));

            for (int j = 0; j < 5;++j){
                for (Lecon l : lecons){
                    if (l.jourSemaine == j && (l.periodeDebut <= i &&
                        l.periodeDebut + l.duree -1 > i)){
                        ligneCourante.append(String.format("|%13s"," "));
                        afficheFinDePeriode = false;
                    }
                }

                if (afficheFinDePeriode){
                    ligneCourante.append("|-------------");
                }

                afficheFinDePeriode = true;
            }

            calendrier.append(ligneCourante).append("|\n");
            ligneCourante.setLength(0); //Efface le contenue
        }

        return calendrier.toString();
    }
}
