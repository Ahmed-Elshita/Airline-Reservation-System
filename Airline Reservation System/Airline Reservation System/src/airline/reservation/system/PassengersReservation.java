package airline.reservation.system;

import java.util.*;
import java.util.Scanner;

public class PassengersReservation {

    Scanner input = new Scanner(System.in);
    HashMap<Integer, personInfo> mapPersonInfo = new HashMap< Integer, personInfo>();
    HashMap<Integer, Passenger> mapPassenger = new HashMap< Integer, Passenger>();
    HashMap<logIn, Integer> maplog = new HashMap< logIn, Integer>();
    public int i;
    public int reservationID = 100;
    private int key;
    personInfo person;
    Passenger passengers;

    public void deleteUser() {

        List<logIn> list = new ArrayList<logIn>(maplog.keySet());
        maplog.remove(list.get(list.size() - 1));

    }

    public int creatAcount() {
        int c = 0, h = 0;
        int i;
        logIn log = new logIn();
        if (!maplog.isEmpty()) {
            for (logIn l : maplog.keySet()) {
                if (l.getUserName().equals(log.getUserName()) && l.getPass().equals(log.getPass())) {

                    System.out.println(" enter another username please ");
                    creatAcount();
                    return 0;

                } else {
                    continue;
                }

            }
        }

        System.out.println(" enter your key number ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        i = input.nextInt();

        if (!mapPersonInfo.isEmpty()) {

            for (int r = 0; r < 3; r++) {
                ++h;
                for (int k : mapPersonInfo.keySet()) {
                    if (i == k) {
                        c++;
                        System.out.println("you should enter a nother key value ");
                        while (!input.hasNextInt()) {
                            System.out.println("Input is not a number.");
                            input.nextLine();
                        }
                        i = input.nextInt();
                    }
                }
                if (c > 0) {
                    continue;
                } else {
                    break;
                }
            }
            if (c == 3 && h == 3) {
                System.out.println("you should craet new account ");

                creatAcount();
                return 0;
            }
        }
        maplog.put(log, i);
        this.i = i;
        System.out.println("your key number is " + i);
        return 0;
    }

    public int logIn() {

        for (int s = 0; s < 3; s++) {

            logIn log = new logIn();

            if (!maplog.isEmpty()) {
                for (logIn l : maplog.keySet()) {
                    if (l.getUserName().equals(log.getUserName()) && l.getPass().equals(log.getPass())) {
                        int i = maplog.get(l);
                        System.out.println("your key number is " + i);
                        person = mapPersonInfo.get(i);
                        personinfro(i);
                        return 0;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println("error try again");
        }
        System.out.println("error log in");
        return 0;
    }

    public int addperson(int i) {

        System.out.println(" TO add a persen  ");

        if (!mapPersonInfo.isEmpty()) {

            for (int k : mapPersonInfo.keySet()) {
                if (i == k) {
                    System.out.println("you should enter a nother key value ");
                    System.out.println(" enter your key number  ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        input.nextLine();
                    }
                    int x = input.nextInt();
                    addperson(x);
                    return 0;
                }
            }

        }
        personInfo s = new personInfo();

        mapPersonInfo.put(i, s);

        System.out.println("your key number is " + i);

        return 0;
    }

    public int addpasenger() {

        for (int i = 0; i < 3; i++) {

            System.out.println("enter your key number ");
            while (!input.hasNextInt()) {
                System.out.println("Input is not a number.");
                input.nextLine();
            }
            this.key = input.nextInt();

            if (!mapPersonInfo.isEmpty()) {

                for (int k : mapPersonInfo.keySet()) {
                    if (key == k) {
                        person = mapPersonInfo.get(key);

                        Passenger c = new Passenger(person, ++reservationID);

                        mapPassenger.put(reservationID, c);
                        System.out.println("your ID reservation is " + (reservationID));
                        return 0;
                    }
                }
                System.out.println(" error key number try again ");
                continue;
            } else {
                System.out.println("error you should creatAcount first and add new persn ");
                creatAcount();
                System.out.println(" enter your key number  ");
                while (!input.hasNextInt()) {
                    System.out.println("Input is not a number.");
                    input.nextLine();
                }
                int x = input.nextInt();
                addperson(x);
                addpasenger();
                return 0;
            }
        }

        System.out.println("error you should creatAcount first");
        creatAcount();
        System.out.println(" enter your key number  ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        int x = input.nextInt();
        addperson(x);
        addpasenger();

        return 0;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getReservationID() {
        return reservationID;
    }

    public int getKey() {
        return key;
    }

    public int personinfro(int key) {

        if (!mapPersonInfo.isEmpty()) {

            for (int k : mapPersonInfo.keySet()) {
                if (i == k) {
                    setKey(key);
                    person = mapPersonInfo.get(key);
                    System.out.println(" the name of person is  " + person.getFristName() + " " + person.getLastName());
                    System.out.println("person address is  " + person.getAddress());
                    System.out.println("person email is  " + person.getEmail());
                    System.out.println("person phone number is  " + person.getPhoneNum());
                    System.out.println("person age is  " + person.getBirthDate());
                    System.out.println("person dingresDesise is  " + person.isDingresDesise());
                    System.out.println("person gender is  " + person.getGender());
                    return 0;
                }

            }
            System.out.println(" error key number");
            return 0;
        }
        System.out.println(" error key number");
        return 0;
    }

    public String fullName(int reservationID) {

        if (!mapPassenger.isEmpty()) {
            for (int k : mapPassenger.keySet()) {
                if (reservationID == k) {
                    setReservationID(reservationID);
                    passengers = mapPassenger.get(this.reservationID);
                    return passengers.toString();
                }

            }
            System.out.println(" error ID Reservation number");
            return "0";
        }
        System.out.println(" error ID Reservation number");
        return "0";
    }

    public int pasengerinfo(int key, int reservationID) {
        if (!mapPassenger.isEmpty() && !mapPersonInfo.isEmpty()) {
            for (int k : mapPassenger.keySet()) {
                for (int x : mapPersonInfo.keySet()) {
                    if (reservationID == k && key == x) {
                        setKey(key);
                        setReservationID(reservationID);

                        person = mapPersonInfo.get(this.key);

                        passengers = mapPassenger.get(this.reservationID);

                        passengers.passengerInfo();
                        System.out.println(" number of passengers is " + Passenger.allpassengers);
                    }

                }
            }
            System.out.println(" error ID Reservation number or error key number");
            return 0;
        }
        System.out.println("  error ID Reservation number or error key number  ");
        return 0;

    }

    public Boolean cheack(int reservationID) {

        if (!mapPassenger.isEmpty()) {
            for (int k : mapPassenger.keySet()) {
                if (reservationID == k) {

                    return true;
                }

            }
            System.out.println(" error ID Reservation number");
            return false;
        }
        System.out.println(" error ID Reservation number");
        return false;
    }

    public void cancelPassenger(int reservationIDPassenger) {

        if (cheack(reservationIDPassenger)) {

            mapPassenger.remove(reservationIDPassenger);

        }

    }

}
