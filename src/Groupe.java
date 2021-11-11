/* ---------------------------
Laboratoire :       POO Labo 6 - Ecole
Fichier :           Groupe.java
Auteur(s) :         Allemano Enzo & Romano Malo
Date :              11.11.2021

But :

Remarque(s) :

Compilateur :       Java 1.8

--------------------------- */
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;

public class Groupe {
    private int numero;
    private String orientation;
    private int trimestre;
    private ArrayList<Lecon> lecons = new ArrayList<>();

    public Groupe(int numero, String orientation, int trimestre) {
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
    }

    public String nom(){
        return orientation + numero + "-" + trimestre;
    }
    public int nombreEtudiants(){
        throw new NotImplementedException();
    }

    public void definirLecons(Lecon ... lecons){
        this.lecons.addAll(Arrays.asList(lecons));
    }

    public String horaire(){
        return Lecon.horaire(lecons.toArray(new Lecon[0]));
    }

}
