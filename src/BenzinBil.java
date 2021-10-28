import java.util.GregorianCalendar;

public class BenzinBil extends Bil {

    private int oktanTal;
    private double kmPrl;

    public BenzinBil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, int _oktanTal, double _kmPrl) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.oktanTal = _oktanTal;
        this.kmPrl = _kmPrl;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "BenzinBil{" +
                "oktanTal=" + oktanTal +
                ", kmPrl=" + kmPrl +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønEjerafgift() {

        double grønAfgift = 0;

        if (kmPrl > 20 && kmPrl < 50) {
            grønAfgift = 330;
        } else if (kmPrl > 15 && kmPrl < 20){
            grønAfgift = 1050;
        }else if (kmPrl > 10 && kmPrl < 15){
            grønAfgift = 2340;
        }else if (kmPrl > 5 && kmPrl < 10){
            grønAfgift = 5500;
        }else if (kmPrl > 5){
            grønAfgift = 10470;
        }
        return grønAfgift;
    }
}