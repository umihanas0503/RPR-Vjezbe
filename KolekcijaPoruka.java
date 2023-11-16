package ba.etf.unsa.rpr;

import java.util.ArrayList;

public class KolekcijaPoruka {

    private String[] poruke;

    public KolekcijaPoruka(Predmet[] predmeti) {
        this.poruke = new String[predmeti.length];
        for (int i = 0; i < predmeti.length; i++) {
            this.poruke[i] = predmeti[i].predstavi();
        }
    }

    public String[] getPoruke() {
        return poruke;
    }



}
