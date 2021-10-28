public class DieselBil extends Bil {

    private boolean harPartikelFilter;
    private int kmPrl;

    public DieselBil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, boolean _harPartikelFilter, int _kmPrl) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.harPartikelFilter = _harPartikelFilter;
        this.kmPrl = _kmPrl;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "DieselBil{" +
                "harPartikelFilter=" + harPartikelFilter +
                ", kmPrl=" + kmPrl +
                ", regNr=" + getRegNr() +
                ", mærke=" + getMærke() + '\'' +
                ", model=" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }


    public double beregnGrønEjerafgift() {

        double grønAfgift = 0;

        if (kmPrl > 20 && kmPrl < 50) {
            grønAfgift = 330 + 130;
        } else if (kmPrl > 15 && kmPrl < 20){
            grønAfgift = 1050 + 1390;
        }else if (kmPrl > 10 && kmPrl < 15){
            grønAfgift = 2340 + 1850;
        }else if (kmPrl > 5 && kmPrl < 10){
            grønAfgift = 5500 + 2770;
        }else if (kmPrl > 5) {
            grønAfgift = 10470 + 15260;
        }

        if (harPartikelFilter == false) {
            grønAfgift = grønAfgift + 1000;
        }
        return grønAfgift;
    }
}
