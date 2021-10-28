public abstract class Bil {
    int regNr;
    String Mærke;
    String Model;
    int Årgang;
    int antalDøre;

    public Bil() {
    }

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return Mærke;
    }

    public void setMærke(String mærke) {
        Mærke = mærke;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getÅrgang() {
        return Årgang;
    }

    public void setÅrgang(int årgang) {
        Årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public Bil(int regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.Mærke = mærke;
        this.Model = model;
        this.Årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerafgift();

}
