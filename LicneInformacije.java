package ba.etf.unsa.rpr;


public class LicneInformacije {
    private String Ime;
    private String Prezime;

    public LicneInformacije(String ime,String Prezime) {
        Ime = ime;
        Prezime=Prezime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public String getIme() {
        return Ime;
    }

    public String getPrezime() {
        return Prezime;
    }
}
