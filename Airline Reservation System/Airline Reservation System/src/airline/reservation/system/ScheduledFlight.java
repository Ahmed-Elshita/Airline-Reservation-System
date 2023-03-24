package airline.reservation.system;

import java.util.*;

public class ScheduledFlight {

    Scanner input = new Scanner(System.in);
    FlightDescriptions FD;
    private String t;
    airlines al = new airlines();
    int x = 1;
    private String cost;
    private String durationTime;
    private String airline;
    private String time;

    ScheduledFlight(FlightDescriptions FD) {
        this.FD = FD;
        System.out.println("what time are you want to travel \"AM\"OR\"PM\"");
        t = input.next();
    }

    public void admin() {

        al.admin();
    }

    public void ChooseAirline() {

        System.out.println("if you admin and want enter data airline enter 1 else enter 0");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a Number.");
            input.nextLine();
        }
        int a = input.nextInt();
        if (a == 1) {
            admin();
        }
        System.out.println("choose one of these");
        al.airline3();

        System.out.println(" the air line is  " + al.getAirline());
        System.out.println(" the cost is   " + al.getCost());
        System.out.println(" the time traver is  " + al.getTime());
        System.out.println(" the getDurationTime is  " + al.getDurationTime());
        System.out.println("---------------");

        al.airline2();
        System.out.println(" the air line is  " + al.getAirline());
        System.out.println(" the cost is   " + al.getCost());
        System.out.println(" the time traver is  " + al.getTime());
        System.out.println(" the getDurationTime is  " + al.getDurationTime());
        System.out.println("---------------");

        al.airline1();

        System.out.println(" the air line is  " + al.getAirline());
        System.out.println(" the cost is   " + al.getCost());
        System.out.println(" the time traver is  " + al.getTime());
        System.out.println(" the getDurationTime is  " + al.getDurationTime());
        System.out.println("---------------");
        System.out.println("enter the choosen number 1 or 2 or 3");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        x = input.nextInt();

        if (x == 1) {

            al.airline1();

            cost = al.getCost();
            durationTime = al.getDurationTime();
            airline = al.getAirline();
            time = al.getTime();
        } else if (x == 2) {
            al.airline2();

            cost = al.getCost();
            durationTime = al.getDurationTime();
            airline = al.getAirline();
            time = al.getTime();

        } else {
            al.airline3();

            cost = al.getCost();
            durationTime = al.getDurationTime();
            airline = al.getAirline();
            time = al.getTime();

        }

    }

    public void infoFlightPassenger() {

        System.out.println(" your distnation from " + FD.getTo());
        System.out.println(" your distnation to " + FD.getFrom());
        System.out.println(" your Departure Date is " + FD.getDeparture());
        System.out.println(" your Arrival Date is " + FD.getArrival());
        System.out.println(" your Class Degree is  " + FD.getClassDegree());
        System.out.println(" your Capacity is " + FD.getCapacity());
        System.out.println("time travel is" + t);
        System.out.println(" the air line is  " + airline);
        System.out.println(" the cost is   " + cost);
        System.out.println(" the time traver is  " + time);
        System.out.println(" the getDurationTime is  " + durationTime);

    }

    public String getCost() {
        return cost;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public String getAirline() {
        return airline;
    }

    public String getTime() {
        return time;
    }

}
