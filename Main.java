package ba.etf.unsa.rpr;

public class Main {
    InformacijeONastavniku a= new InformacijeONastavniku("Ali","Rejjan","dekan");

    public static void main(String[] args) {
        Predmet predmet1 = new Predmet("Matematika", "Osnove matematike");
        Predmet predmet2 = new Predmet("Programiranje", "Osnove programiranja");

        KolekcijaPoruka kolekcijaPoruka = new KolekcijaPoruka(new Predmet[]{predmet1, predmet2});

        String[] poruke = kolekcijaPoruka.getPoruke();

        for (String poruka : poruke) {
            System.out.println(poruka);
        }
    }
}