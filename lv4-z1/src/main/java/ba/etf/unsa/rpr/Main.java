package ba.etf.unsa.rpr;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setBrend("Dell");
        laptop1.setModel("XPS 13");
        laptop1.setCijena(1499.99);
        laptop1.setRam(16);
        laptop1.setHdd(1000);
        laptop1.setSsd(256);
        laptop1.setProcesor("Intel i7");
        laptop1.setGrafickaKartica("Intel UHD Graphics");
        laptop1.setVelicinaEkrana(13.3);

        File file = new File("laptops.txt");
        LaptopDao dao = new LaptopDaoSerializableFile(file);

        dao.dodajLaptopUListu(laptop1);
        dao.dodajLaptopUFile(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setBrend("HP");
        laptop2.setModel("Spectre x360");
        laptop2.setCijena(1299.99);
        laptop2.setRam(8);
        laptop2.setHdd(1000);
        laptop2.setSsd(512);
        laptop2.setProcesor("Intel i5");
        laptop2.setGrafickaKartica("Intel UHD Graphics");
        laptop2.setVelicinaEkrana(13.3);

        dao.dodajLaptopUListu(laptop2);
        dao.dodajLaptopUFile(laptop2);

        ArrayList<Laptop> laptopi = new ArrayList<>();
        dao.napuniListu(laptopi);

        for (Laptop laptop : laptopi) {
            System.out.println("Brend: " + laptop.getBrend());
            System.out.println("Model: " + laptop.getModel());
            System.out.println();
        }

        try {
            Laptop laptopWithIntelI7 = dao.getLaptop("Intel i7");
            if (laptopWithIntelI7 != null) {
                System.out.println("Pronađen laptop s procesorom Intel i7: " + laptopWithIntelI7.getModel());
            } else {
                System.out.println("Nema laptopa s procesorom Intel i7.");
            }
        } catch (Exception e) {
            System.out.println("Greška: " + e.getMessage());
        }

        dao.vratiPodatkeIzDatoteke();
        ArrayList<Laptop> laptopiIzDatoteke = new ArrayList<>();
        dao.napuniListu(laptopiIzDatoteke);

        for (Laptop laptop : laptopiIzDatoteke) {
            System.out.println("Brend: " + laptop.getBrend());
            System.out.println("Model: " + laptop.getModel());
            // Dodaj ispis svih atributa
            System.out.println();
        }
    }
}
