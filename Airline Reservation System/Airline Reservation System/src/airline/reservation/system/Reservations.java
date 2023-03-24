package airline.reservation.system;

import java.util.*;

public class Reservations {

    Scanner input = new Scanner(System.in);
    int noOfTicket = 50;
    HashMap<Integer, Ticket> mapticket = new HashMap< Integer, Ticket>();
    Ticket t;

    PassengersReservation pr = new PassengersReservation();
    private int reservationIDPassenger;
    FlightDescriptionScheduled fr = new FlightDescriptionScheduled();

    public int quickReservation() {

        System.out.println(" enter your key number  ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        int x = input.nextInt();
        pr.addperson(x);
        System.out.println("============================");

        System.out.println("To Add anew travel");
        System.out.println("");
        pr.addpasenger();
        System.out.println("============================");
        System.out.println("enter your Flight Descriptions");
        System.out.println("");

        System.out.println("enter your ID reservation number");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }

        this.reservationIDPassenger = input.nextInt();
        if (pr.cheack(reservationIDPassenger)) {
            fr.addFlightDescriptions(reservationIDPassenger);
            System.out.println("============================");
            System.out.println("enter your Scheduled Flight");
            System.out.println("");
            fr.addScheduledFlight(reservationIDPassenger);
            System.out.println("============================");
            System.out.println("To enter Credit Card infromation");

            fr.enterCreditCard(this.reservationIDPassenger);

            ticket(this.reservationIDPassenger);
            System.out.println("============================");
            return 0;
        } else {
            pr.cancelPassenger(reservationIDPassenger);
            --pr.reservationID;
            addReservation();

            return 0;
        }

    }

    public void getinfromationperson(int key) {
        System.out.println("your infromation is");
        System.out.println("");
        pr.personinfro(key);
        System.out.println("============================");
    }

    public int getinfromationreservation(int key, int reservationIDPassenger, int noOfTicket) {
        System.out.println("your infromation is");
        System.out.println("");
        if (pr.cheack(reservationIDPassenger)) {

            int c = 0;
            System.out.println("");
            if (!mapticket.isEmpty()) {

                for (int n : mapticket.keySet()) {
                    if (n == noOfTicket) {
                        c = 1;
                        System.out.println("your infromation Ticket is");
                        getTicket(noOfTicket);
                        System.out.println("============================");
                    }

                    if (c == 1) {
                        c = 2;
                        break;
                    }
                }
                if (c == 0) {
                    System.out.println("error Ticket  number ");
                    return 0;
                }
            } else {
                System.out.println("error Ticket  number ");
                return 0;
            }
            pr.pasengerinfo(key, reservationIDPassenger);
            System.out.println("============================");
            this.reservationIDPassenger = reservationIDPassenger;
            System.out.println("your infromation Reservation is");
            System.out.println("");

            fr.getinforeservation(this.reservationIDPassenger);
            System.out.println("============================");
            System.out.println("your infromation  Credit Card is");
            System.out.println("");
            fr.getCreditCard(this.reservationIDPassenger);
            System.out.println("============================");
            return 0;

        } else {
            return 0;
        }

    }

    public int cancelReservation(int reservationIDPassenger, int noOfTicket) {
        this.reservationIDPassenger = reservationIDPassenger;
        if (pr.cheack(this.reservationIDPassenger)) {
            System.out.println("============================");

            if (!mapticket.isEmpty()) {
                for (int n : mapticket.keySet()) {
                    if (n == noOfTicket) {
                        cancelTicket(noOfTicket);
                        fr.cancelReservation(this.reservationIDPassenger);
                        System.out.println("DONE");
                        System.out.println("============================");
                        return 0;

                    }

                }
            } else {
                System.out.println("error Ticket  number ");
                return 0;
            }

        } else {
            System.out.println("error ID reservation try again ");
            return 0;
        }
        System.out.println("error ID reservation or Ticket number please try again ");
        return 0;
    }

    public int CreateAcount() {
        System.out.println(" to Create anew Acount  ");
        System.out.println("");
        pr.creatAcount();
        System.out.println("============================");
        System.out.println(" to ensure your key number ");

        System.out.println(" enter your key number  ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        int x = input.nextInt();
        if (x == pr.i) {
            pr.addperson(x);
            System.out.println("============================");
            return 0;
        } else {
            pr.deleteUser();
            System.out.println("error please try agan ");
            return 0;
        }
    }

    public void login() {
        System.out.println(" To log In");
        pr.logIn();
        System.out.println("============================");
    }

    public int addReservation() {

        System.out.println("If you have a key number enter 0 else enter 1 ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        int x = input.nextInt();
        if (x == 0) {
            System.out.println("To Add anew travel");
            System.out.println("");
            pr.addpasenger();
            System.out.println("============================");
            System.out.println("enter your Flight Descriptions");
            System.out.println("");
            System.out.println("enter your ID reservation number");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }

            this.reservationIDPassenger = input.nextInt();
            if (pr.cheack(this.reservationIDPassenger)) {
                fr.addFlightDescriptions(reservationIDPassenger);
                System.out.println("============================");
                System.out.println("enter your Scheduled Flight");
                System.out.println("");
                fr.addScheduledFlight(reservationIDPassenger);
                System.out.println("============================");
                System.out.println("To enter Credit Card infromation");

                fr.enterCreditCard(this.reservationIDPassenger);
                ticket(this.reservationIDPassenger);
                System.out.println("============================");
                return 0;
            } else {
                pr.cancelPassenger(reservationIDPassenger);
                --pr.reservationID;
                return 0;
            }
        } else {
            CreateAcount();
            System.out.println("============================");
            System.out.println("To Add anew travel");
            System.out.println("");
            pr.addpasenger();
            System.out.println("============================");
            System.out.println("enter your Flight Descriptions");
            System.out.println("");
            System.out.println("enter your ID reservation number");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }

            this.reservationIDPassenger = input.nextInt();
            if (pr.cheack(this.reservationIDPassenger)) {
                fr.addFlightDescriptions(reservationIDPassenger);
                System.out.println("enter your Scheduled Flight");
                System.out.println("");
                fr.addScheduledFlight(reservationIDPassenger);
                System.out.println("============================");
                System.out.println("To enter Credit Card infromation");

                fr.enterCreditCard(this.reservationIDPassenger);
                ticket(this.reservationIDPassenger);
                System.out.println("============================");
                return 0;
            } else {
                pr.cancelPassenger(reservationIDPassenger);
                --pr.reservationID;
                return 0;
            }
        }
    }

    public void ticket(int reservationIDPassenger) {
        this.reservationIDPassenger = reservationIDPassenger;

        Ticket ticket = new Ticket(this.reservationIDPassenger);
        ticket.setAirline(fr.getinfoAirLine(this.reservationIDPassenger));

        ticket.setDate(fr.getinfodate(this.reservationIDPassenger));
        ticket.setFrom(fr.getinfofrom(this.reservationIDPassenger));
        ticket.setFullName(pr.fullName(this.reservationIDPassenger));

        ticket.setReservationID(this.reservationIDPassenger);
        ticket.setTo(fr.getinfoto(this.reservationIDPassenger));
        mapticket.put(++noOfTicket, ticket);
        System.out.println("your ticket number is  " + noOfTicket);

    }

    public int getTicket(int noOfTicket) {

        if (!mapticket.isEmpty()) {
            for (int x : mapticket.keySet()) {
                if (noOfTicket == x) {
                    t = mapticket.get(noOfTicket);

                    System.out.println("you name is " + t.getFullName());
                    System.out.println(" From " + t.getFrom());
                    System.out.println("TO " + t.getTo());
                    System.out.println("Date travel " + t.getDate());
                    System.out.println("Airline is  " + t.getAirline());
                    System.out.println("your ReservationID is " + t.getReservationID());
                    return 0;

                }

            }
            System.out.println("error ticket number ");
            return 0;
        } else {
            System.out.println("error ticket number ");
            return 0;
        }

    }

    public int cancelTicket(int noOfTicket) {
        if (!mapticket.isEmpty()) {
            for (int x : mapticket.keySet()) {
                if (noOfTicket == x) {
                    mapticket.remove(noOfTicket);

                    return 0;

                }

            }
            System.out.println("error ticket number ");
            return 0;
        } else {
            System.out.println("error ticket number ");
            return 0;
        }

    }

}
