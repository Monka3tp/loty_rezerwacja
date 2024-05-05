import java.util.ArrayList;
import java.util.List;

//Klasa FlightBookingSystem:
//Klasa implementująca interfejs FlightReservationSystem.
//Zaimplementuj wszystkie metody interfejsu.
//Wykorzystaj kolekcję do przechowywania dostępnych lotów, a także informacji o rezerwacjach.
public class FlightBookingSystem implements FlightReservationSystem{
    ArrayList<Flight> dostepneLoty;
    private ArrayList<Reservation> rezerwacje;
    public FlightBookingSystem() {
        dostepneLoty = new ArrayList<>(); //lista wszystkich dostepych lotow
        rezerwacje = new ArrayList<>(); //lista wszystkich rezerwacji
    }
    //metoda dodaje rezerwację na podstawie wprowadzonych danych
    @Override
    public void rezerwujLot(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu) {
        Reservation rezerwacja = new Reservation(nazwaLotu, imiePasazera, nazwiskoPasazera, cenaBiletu);
        rezerwacje.add(rezerwacja);
    }
    //metoda anuluje istniejącą rezerwację na podstawie utowrzonego obiektu z Reservtion
    @Override
    public void anulujRezerwacje(Reservation rezerwacja) {
        rezerwacje.remove(rezerwacja);
    }
    //metoda zwraca liste dostepnych lotów na podstawie wprowadzonych dancyh
    @Override
    public ArrayList<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu) {
        ArrayList<Flight> wynik = new ArrayList<>();
        for (Flight lot : dostepneLoty) {
            if (lot.getMiejsceDocelowe().equals(miejsceDocelowe) && lot.getDataWylotu().equals(dataWylotu)) {
                wynik.add(lot);
            }
        }
        return wynik;
    }

    //metoda wyświetla informacje o dostępnych lotach
    @Override
    public void dostepneLoty() {
        for(Flight lot : dostepneLoty){
            System.out.println("Dostępny lot do " + lot.getMiejsceDocelowe()
                    + " w dniu " + lot.getDataWylotu()
                    + " liczba wolnych miejsc: " + lot.getLiczbaDostepnychMiejsc());
        }
    }
}
