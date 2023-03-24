package airline.reservation.system;

import java.util.*;

public class personInfo {

    Scanner input = new Scanner(System.in);

    private String fristName;
    private String lastName;
    private String address;
    private String email;
    private String BirthDate;
    private String gender;
    private double phoneNum;
    private boolean dingresDesise;

    public personInfo() {

        System.out.println("please enter your frist name ");

        fristName = input.next();

        System.out.println("please enter your last name ");

        lastName = input.next();

        System.out.println("please enter your address ");

        address = input.next();

        System.out.println("please enter your email ");

        email = input.next();

        System.out.println("please enter your BirthDate \"dd-MM-YYYY\"  ");

        BirthDate = input.next();

        System.out.println("please enter your phoneNum ");
        while (!input.hasNextDouble()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        phoneNum = input.nextDouble();

        System.out.println("Are you have any dingresDesise ? \" true or false\" ");
        while (!input.hasNextBoolean()) {
            System.out.println("Input is not a Boolean.");
            input.nextLine();
        }
        dingresDesise = input.nextBoolean();
        System.out.println("please enter your Gender \"male or female\" ");
        gender = input.next();
    }

    @Override
    public String toString() {
        return "personInfo{" + "fristName=" + fristName + ", lastName=" + lastName + '}';
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public boolean isDingresDesise() {
        return dingresDesise;
    }

    public String getGender() {
        return gender;
    }

}
