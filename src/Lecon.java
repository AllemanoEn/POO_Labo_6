/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Lecon.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */
import org.omg.CORBA.Environment;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Lecon {

    private String matiere;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String salle;
    private Professeur professeur;

    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
    }
    public Lecon(String matiere, int jourSemaine, int periodeDebut,
                 int duree, String salle, Professeur professeur){
        this(matiere, jourSemaine, periodeDebut, duree, salle);
        this.professeur = professeur;
    }


    public static String horaire(Lecon ... lecons){
        StringBuilder calendrier = new StringBuilder();
        StringBuilder ligneCourante = new StringBuilder();
        boolean afficherCelluleVide = true;
        String[] periode = new String[]{"8:30","9:15","10:25","11:15","12:00","13:15","14:00","14:55","15:45","16:35","17:20"};
        calendrier.append(String.format("%76s","| Lun         | Mar         | Mer         | Jeu         | Ven         |")).append("\n");
        calendrier.append(String.format("%76s","|-------------|-------------|-------------|-------------|-------------|")).append("\n");

        for (int i = 0; i < 11;++i){
            ligneCourante.append(String.format("%5s",periode[i]));
            for (int j = 0; j < 5;++j){
                ligneCourante.append("|");

                for (Lecon l : lecons){
                    if (l.jourSemaine == j && l.periodeDebut == i){
                        ligneCourante.append(String.format("%13s", l.matiere + " " + l.salle + " " + (l.professeur == null ? "" : l.professeur.abreviation())));
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
                ligneCourante.append("|-------------");
            }

            calendrier.append(ligneCourante).append("|\n");
            ligneCourante.setLength(0); //Efface le contenue
        }

        return calendrier.toString();
    }
}
