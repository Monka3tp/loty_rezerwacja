import java.util.ArrayList;
import java.util.List;

//Interfejs FlightReservationSystem
//Interfejs zawierający metody do zarządzania rezerwacjami lotów.
//Metody do rezerwacji, anulowania rezerwacji, wyszukiwania lotów oraz wyświetlania dostępnych lotów.
public interface FlightReservationSystem {
    void rezerwujLot(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu);
    void anulujRezerwacje(Reservation rezerwacja);
    ArrayList<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu);
    void dostepneLoty();
}
