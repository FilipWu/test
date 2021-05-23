

import java.io.Serializable;
import java.util.List;

public class student implements Serializable {
    private String imie;
    private String nazwisko;
    private int odlegloscOdUczelni;
    private short aktualnySemestrStudiow;
    private String typStududiow;
    private List<Float> oceny;

    public student(String imie, String nazwisko, short aktualnySemestrStudiow,
                   String typStududiow, List<Float> oceny, int odlegloscOdUczelni) {
        System.out.println("informacje o Studenta");
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.odlegloscOdUczelni = odlegloscOdUczelni;
        this.aktualnySemestrStudiow = aktualnySemestrStudiow;
        this.typStududiow = typStududiow;
        this.oceny = oceny;
    }
    public void wyswietl() {
        String student = imie + " " + nazwisko + ", " + typStududiow + "," + aktualnySemestrStudiow + " " +
                "semestr "+", " + oceny +", "+ odlegloscOdUczelni;
        System.out.println(student);
    }

    public int liczbaSemestrowDoKoncaStudiow() {
        int iloscsemestrow;
        if (typStududiow == "licencjackie") iloscsemestrow = 6;
        else if (typStududiow == "magisterskie") iloscsemestrow = 4;
        else if (typStududiow == "inzynierskie") iloscsemestrow = 7;
        else iloscsemestrow = 0;


        int iloscpozostalychsemestrow = iloscsemestrow - aktualnySemestrStudiow;
        return iloscpozostalychsemestrow;
    }
    public float sredniaocen() {
        float srednia =0.0f;
        for (int i = 0; i < oceny.size(); i++) {
            srednia = srednia + oceny.get(i);
        }
        srednia = srednia / oceny.size();
        return srednia;
    }
    public boolean czyPrzyslugujeAkademik() {
        boolean wynik;
        wynik= odlegloscOdUczelni > 100 && sredniaocen() > 3.5f;
        return wynik;
    }
    public float kwotaStypentium() {
        int kwota =0;
        float srednia = sredniaocen();
        if (srednia <=4) kwota = 0;
        else if (srednia >4 && srednia <4.5) kwota = 300;
        else if (srednia >= 4.5) kwota = 500;
        return kwota;
        }
    }

