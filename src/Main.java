import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightBookingSystem rezerwacja = new FlightBookingSystem();
        Flight lotMadryt = new Flight("Madryt", "Warszawa","01.05.2024" , "5 godz.", 12);
        Flight lotMediolan = new Flight("Mediolan", "Kraków","12.06.2024" , "2 godz.", 3);

        rezerwacja.dostepneLoty.add(lotMadryt);
        rezerwacja.dostepneLoty.add(lotMediolan);

        rezerwacja.rezerwujLot(lotMadryt, "Kacper", "Nowak", 250);
        rezerwacja.rezerwujLot(lotMediolan, "Natalia", "Kowalska", 120);

        rezerwacja.dostepneLoty();

        //po tej rezerwacji widać, że zmienia się liczba wolnych miejsc
        Reservation rezerwacja1 = new Reservation(lotMadryt, "Patryk", "Malinowski", 340);
        rezerwacja.anulujRezerwacje(rezerwacja1);

        rezerwacja.dostepneLoty();

        ArrayList<Flight> znalezioneLoty = rezerwacja.wyszukajLot("Mediolan", "12.06.2024");
        for(Flight lot : znalezioneLoty){
            System.out.println("Lot znaleziony. Miejsce docelowe: " + lot.getMiejsceDocelowe()
                    + " z " + lot.getMiejsceWylotu()
                    + " w dniu: " + lot.getDataWylotu());
        }


    }

}