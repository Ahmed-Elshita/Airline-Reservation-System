package airline.reservation.system;

import java.util.*;

public class Passenger {

    Scanner input = new Scanner(System.in);
    public static double allpassengers = 0;
    public double numberOfPerson;
    private String fristName;
    private String lastName;
    private personInfo person;

    Passenger(personInfo person, double numberOfPerson) {

        this.person = person;

        this.numberOfPerson = numberOfPerson;

        fristName = person.getFristName();
        lastName = person.getLastName();
        allpassengers++;

    }

    public void passengerInfo() {

        System.out.println(" the name of passenger is  " + person.getFristName() + " " + person.getLastName());
        System.out.println("passenger address is  " + person.getAddress());
        System.out.println("passenger email is  " + person.getEmail());
        System.out.println("passenger phone number is  " + person.getPhoneNum());
        System.out.println("passenger age is  " + person.getBirthDate());
        System.out.println("passenger dingresDesise is  " + person.isDingresDesise());
        System.out.println("passenger gender is  " + person.getGender());

        //System.out.println("passenger ID is" + numberOfPerson);
    }

    @Override
    public String toString() {
        return "Passenger{" + "fristName=" + fristName + ", lastName=" + lastName + '}';
    }

}
