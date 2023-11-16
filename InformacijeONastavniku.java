package ba.etf.unsa.rpr;
import java.util.*;
public class InformacijeONastavniku extends LicneInformacije implements Predstavljiv{

private String titula;

    public InformacijeONastavniku(String ime, String Prezime,String titula) {
        super(ime, Prezime);
        this.titula=titula;
    }

    public InformacijeONastavniku(String ime, String Prezime) {
        super(ime,Prezime);
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String predstavi() {
        return "Ime:"+getIme()+"Prezime:"+getPrezime();
    }
}
