import java.util.ArrayList;

public class Garage extends ArrayList {

    private static final long serialVersionUID = 1L;
    ArrayList<Bil> arraylist = new ArrayList<>();

    void tilføjBilTilGarage(Bil bil) {arraylist.add(bil);}

    void udregnGrønAfgift(){
        double samletAfgift = 0;
        for(Bil bil: arraylist) {
            samletAfgift = (samletAfgift + bil.beregnGrønEjerafgift());
        }
        System.out.println("Den samlede afgift er følgende: " + samletAfgift + " kr");
    }

    @Override
    public String toString(){
        String resultat = "";
        for(Bil bil: arraylist){
            resultat += bil.toString();
            resultat += "\r\n";
        }
        return resultat;
    }

}
