package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();

    public static ArrayList<Towar> towaryWSklepie = new ArrayList<Towar>();
    public static void main(String[] args) {
        //towary
        Towar t1 = new Towar("spodnie Levis", 234.56);
        Towar t2= new Towar("telefon Galaxy S99", 12234.56);
        Towar t3 = new Towar("sok jabłko-mięta", 2.56);
        towaryWSklepie.add(t1);
        towaryWSklepie.add(t2);
        towaryWSklepie.add(t3);

        // osoby ...
        Osoba osoba1 = new Osoba("Jan", "Kowalski", "1980-11-02", new Adres("Poznań", "ul. Szklista 12", "60-111"));
        Osoba osoba2 = new Osoba("Anna", "Zamojska", "1988-03-02");
        Osoba osoba3 = new Osoba("Janina", "Kot", "1988-04-02");
        Osoba osoba4 = new Osoba("Antoni", "Robak", "1995-12-02");
        osoba1.setPieniądze(1200);
        osoba2.setPieniądze(500);
        osoba3.setPieniądze(50);
        osoba2.setPieniądze(10);
        listaOsob.add(osoba1);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(osoba4);
        System.out.println("Symulacja zachowania w sklepie");
        for(Osoba osoba : listaOsob)

        System.out.println(osoba1.getImię());
        boolean czyUdałoSię = osoba1.setNazwisko("Mickiewcz!");
        if (!czyUdałoSię)
            System.out.println("Nie udało się zmienić nazwiska");
        for(Osoba osX : listaOsob)
            System.out.println(osX.toString());
        for(int i = 0; i < listaOsob.size(); i++)
            System.out.println(listaOsob.get(i).toString());
    }
}
