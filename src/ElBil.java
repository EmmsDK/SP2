public class ElBil extends Bil{

    private double batteriKapacitetKWh;
    private int MaxKm;
    private double whPrKm;

    public ElBil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, double _batteriKapacitetKWh, int _maxKm, double _whPrKm) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.batteriKapacitetKWh = _batteriKapacitetKWh;
        this.MaxKm = _maxKm;
        this.whPrKm = _whPrKm;
    }

    public double getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(double batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return MaxKm;
    }

    public void setMaxKm(int maxKm) {
        MaxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString(){
        return "Elbil{" +
                "batterikapacitetKWh=" + batteriKapacitetKWh +
                ", MaxKm=" + MaxKm +
                ", whPrKm=" + whPrKm +
                ", regNr=" + getRegNr() +
                ", mærke=" + getMærke() + '\'' +
                ", model=" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønEjerafgift() {

        double grønAfgift = 0;
        double kmPrl = 100 / (whPrKm/91.25);

        if (kmPrl > 20 && kmPrl < 50) {
            grønAfgift = 330;
        } else if (kmPrl > 15 && kmPrl < 20){
            grønAfgift = 1050;
        }else if (kmPrl > 10 && kmPrl < 15){
            grønAfgift = 2340;
        }else if (kmPrl > 5 && kmPrl < 10){
            grønAfgift = 5500;
        }else if (kmPrl > 5) {
            grønAfgift = 10470;
        }
        return grønAfgift;
    }
}
