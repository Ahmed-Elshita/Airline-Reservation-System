package airline.reservation.system;

import java.util.*;

public class FlightDescriptions {

    Scanner input = new Scanner(System.in);
    public String from;
    public String to;
    public String Arrival;
    public String Departure;
    public float Capacity;
    public String ClassDegree;

    FlightDescriptions() {

        System.out.println("please enter your distnation from and to \n from");
        from = input.next();
        System.out.println("to");
        to = input.next();
        System.out.println("please enter your Departure Date \" dd-MM-yyyy\" ");
        Departure = input.next();
        System.out.println("please enter your Arrival Date \" dd-MM-yyyy\" ");
        Arrival = input.next();
        System.out.println("please enter your Class Degree are you want  \" A,B,C,D\" ");
        ClassDegree = input.next();
        System.out.println("please enter your Capacity \" Kg\" ");
        while (!input.hasNextFloat()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        Capacity = input.nextFloat();

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getArrival() {
        return Arrival;
    }

    public String getDeparture() {
        return Departure;
    }

    public float getCapacity() {
        return Capacity;
    }

    public String getClassDegree() {
        return ClassDegree;
    }

}
