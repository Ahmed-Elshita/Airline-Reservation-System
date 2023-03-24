package airline.reservation.system;

import java.util.*;

public class airlines {

    Scanner input = new Scanner(System.in);
    private int pass;
    private String cost = "55452$";
    private String durationTime = "10h";
    private String airline = "Iran Airline";
    private String time = "03-00-00";

    public void admin() {

        System.out.println("enter your pss");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        pass = input.nextInt();

        if (pass == 0000) {
            System.out.println("please enter airline");
            this.airline = input.next();
            System.out.println("please enter cost");
           this. cost = input.next();
            System.out.println("please enter Time \"hh-mm-ss\" ");
           this. time = input.next();
            System.out.println("please enter durationTime \"hh-mm-ss\" ");
           this. durationTime = input.next();
        } else {
            System.out.println("ERROR");
        }
    }

    public void airline1() {

        setCost("1258$");
        setDurationTime("12h");
        setAirline(" American Airlines");
        setTime("07-00-00");
    }

    public void airline2() {

        setCost("1290$");
        setDurationTime("15h");
        setAirline(" Egption Airlines");
        setTime("07-00-00");
    }

    public void airline3() {

        setCost(this.cost);
        setDurationTime(this.durationTime);
        setAirline(this.airline);
        setTime(this.time);

    }

    public String getAirline() {
        return airline;
    }

    public String getCost() {
        return cost;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public String getTime() {
        return time;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
