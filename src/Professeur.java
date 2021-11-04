import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Professeur extends Personne {
    private String abreviation;

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        setAbreviation(abreviation);
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String abreviation(){
        throw new NotImplementedException();
    }

    public String toString(){
        return "Prof. " + super.toString() + " (" + getAbreviation() + ")";
    }

    public String horaire(){
        throw new NotImplementedException();
    }

}
