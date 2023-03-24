package airline.reservation.system;

import java.util.*;

public class AirlineReservationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Reservations r = new Reservations();
        while (true) {
            System.out.println(" welcon in  Airline Reservation System ");
            System.out.println(" If you want creat new account  enter 1       \t\t   If you want log in enter 2");
            System.out.println(" If you want add reservation enter 3 \t\t\t   If you want your ticket  enter 4");
            System.out.println(" If you want quick reservation enter 5\t\t\t   If you want cancel reservation  enter 6");
            System.out.println(" If you want know your infromation reservation  enter 7    If you want know infromation personal  enter 8 ");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }
            int choose = input.nextInt();
            switch (choose) {

                case 1: {

                    r.CreateAcount();

                    break;
                }
                case 2: {

                    r.login();
                    break;
                }

                case 3: {

                    r.addReservation();
                    break;
                }

                case 4: {

                    System.out.println("enter your ticket number ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int ticketno = input.nextInt();
                    r.getTicket(ticketno);
                    break;
                }

                case 5: {

                    r.quickReservation();
                    break;
                }

                case 6: {

                    System.out.println("enter your ID reservation ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int ID = input.nextInt();
                    System.out.println("enter your ticket number ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int ticketno = input.nextInt();
                    r.cancelReservation(ID, ticketno);
                    break;
                }

                case 7: {

                    System.out.println("enter your key number ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int key = input.nextInt();
                    System.out.println("enter your ID reservation ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int ID = input.nextInt();
                    System.out.println("enter your ticket number ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int ticketno = input.nextInt();
                    r.getinfromationreservation(key, ID, ticketno);
                    break;
                }
                case 8: {
                    System.out.println("enter your key number ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int key = input.nextInt();
                    r.getinfromationperson(key);
                }
                default:
                    System.out.println("error enput please try again");

            }

        }
    }
}
