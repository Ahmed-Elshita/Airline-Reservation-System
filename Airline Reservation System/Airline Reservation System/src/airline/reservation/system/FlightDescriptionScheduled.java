package airline.reservation.system;

import java.util.*;

public class FlightDescriptionScheduled {

    Scanner input = new Scanner(System.in);
    HashMap<Integer, FlightDescriptions> mapFlightDescriptions = new HashMap< Integer, FlightDescriptions>();
    HashMap<Integer, ScheduledFlight> mapScheduledFlight = new HashMap< Integer, ScheduledFlight>();
    HashMap<Integer, creditCard> mapcreditCard = new HashMap< Integer, creditCard>();

    creditCard cc;
    private int reservationIDPassenger;
    FlightDescriptions fd;
    ScheduledFlight sf;

    public void addFlightDescriptions(int idReservation) {

        this.reservationIDPassenger = idReservation;
        FlightDescriptions s = new FlightDescriptions();
        mapFlightDescriptions.put(this.reservationIDPassenger, s);

    }

    public void addScheduledFlight(int idReservation) {
        this.reservationIDPassenger = idReservation;
        fd = mapFlightDescriptions.get(this.reservationIDPassenger);

        ScheduledFlight c = new ScheduledFlight(fd);

        
        c.ChooseAirline();
        mapScheduledFlight.put(this.reservationIDPassenger, c);
        System.out.println("your ID reservation is" + this.reservationIDPassenger);

    }

    public void enterCreditCard(int reservationID) {

        this.reservationIDPassenger = reservationID;
        creditCard c = new creditCard();
        mapcreditCard.put(this.reservationIDPassenger, c);

    }

    public void getCreditCard(int reservationID) {

        this.reservationIDPassenger = reservationID;
        cc = mapcreditCard.get(this.reservationIDPassenger);

        System.out.println(" your card no is " + cc.getCardNo());

        System.out.println("  your card Type is " + cc.getCardType());

        System.out.println("  your holder Name is " + cc.getHolderName());

        System.out.println("  your expiry Date is " + cc.getExpiryDate());

        System.out.println("  your bank Name  is" + cc.getBankName());

    }

    public void getinforeservation(int reservationID) {

        this.reservationIDPassenger = reservationID;
        sf = mapScheduledFlight.get(this.reservationIDPassenger);
        sf.infoFlightPassenger();

    }

    public String getinfoAirLine(int reservationID) {

        this.reservationIDPassenger = reservationID;
        sf = mapScheduledFlight.get(this.reservationIDPassenger);
        return sf.getAirline();

    }

    public String getinfodate(int reservationID) {

        this.reservationIDPassenger = reservationID;
        fd = mapFlightDescriptions.get(this.reservationIDPassenger);
        return fd.getArrival();

    }

    public String getinfofrom(int reservationID) {

        this.reservationIDPassenger = reservationID;
        fd = mapFlightDescriptions.get(this.reservationIDPassenger);
        return fd.getFrom();

    }

    public String getinfoto(int reservationID) {

        this.reservationIDPassenger = reservationID;
        fd = mapFlightDescriptions.get(this.reservationIDPassenger);
        return fd.getTo();

    }

    public void cancelReservation(int reservationID) {

        this.reservationIDPassenger = reservationID;
        mapFlightDescriptions.remove(this.reservationIDPassenger);
        mapScheduledFlight.remove(this.reservationIDPassenger);
        mapcreditCard.remove(this.reservationIDPassenger);

    }
}
