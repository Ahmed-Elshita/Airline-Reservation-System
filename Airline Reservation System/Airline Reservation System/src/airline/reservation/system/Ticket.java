package airline.reservation.system;

import java.util.Scanner;

public class Ticket {

    Scanner input = new Scanner(System.in);

    private int keyNo;
    private int reservationID;
    private String fullName;
    private String from;
    private String to;
    private String date;
    private String airline;

    Ticket( int id) {
        
        setReservationID(id);
    }

  

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

  

    public int getReservationID() {
        return reservationID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getAirline() {
        return airline;
    }

}
