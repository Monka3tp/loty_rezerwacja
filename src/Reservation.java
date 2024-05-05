//Klasa Reservation
//Klasa reprezentująca rezerwację na lot
//Zawiera pole wskazujące na konkretny lot oraz dane posiadacza i cenę biletu
//Konstruktor automatycznie zmniejsza liczbę wolnych miejsc w locie
public class Reservation {
    private Flight NazwaLotu;
    private String ImiePasazera;
    private String NazwiskoPasazera;
    private double CenaBiletu;

    public Reservation(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu) {
        NazwaLotu = nazwaLotu;
        ImiePasazera = imiePasazera;
        NazwiskoPasazera = nazwiskoPasazera;
        CenaBiletu = cenaBiletu;
        nazwaLotu.setLiczbaDostepnychMiejsc(nazwaLotu.getLiczbaDostepnychMiejsc()-1);
    }


}
