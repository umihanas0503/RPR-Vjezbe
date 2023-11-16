package ba.etf.unsa.rpr;
import java.util.*;
public class InformacijeOStudentu extends LicneInformacije implements Predstavljiv{

    private String godinaStudija;
    private String index;

    public InformacijeOStudentu(String ime,String prezime, String godinaStudija,String index) {
        super(ime,prezime);
        this.godinaStudija = godinaStudija;
        this.index=index;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public String getIndex() {
        return index;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String predstavi() {
     return "IME"+getIme()+"Prezime"+getPrezime();
    }
}
