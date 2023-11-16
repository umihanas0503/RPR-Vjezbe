package ba.etf.unsa.rpr;

public class Predmet implements Predstavljiv{
    private String Naziv;
    private String Opis;

    public String getNaziv() {
        return Naziv;
    }

    public Predmet(String naziv,String opis) {
        Opis=opis;
        Naziv = naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    @Override
    public String predstavi() {
        return "Predmet"+getNaziv();
    }
}
