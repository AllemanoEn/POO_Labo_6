import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;

public class Groupe {
    private int numero;
    private String orientation;
    private int trimestre;
    private ArrayList<Lecon> lecons = new ArrayList<Lecon>();

    public Groupe(int numero, String orientation, int trimestre) {
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
    }

    public String toString(){
        return orientation + numero + "-" + trimestre;
    }
    public String nom(){
        throw new NotImplementedException();
    }
    public int nombreEtudiants(){
        throw new NotImplementedException();
    }

    public void definirLecons(Lecon ... lecons){
        this.lecons.addAll(Arrays.asList(lecons));
    }

    public String horaire(){
        throw new NotImplementedException();
    }

}
