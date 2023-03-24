package airline.reservation.system;

import java.util.Scanner;

public class creditCard {

    Scanner input = new Scanner(System.in);
    private double cardNo;
    private String cardType;
    private String holderName;
    private String expiryDate;
    private String bankName;

    creditCard() {

        System.out.println(" please enter you card no ");
        while (!input.hasNextDouble()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }
        cardNo = input.nextDouble();
        System.out.println(" please enter you card Type ");
        cardType = input.next();
        System.out.println(" please enter you holder Name ");
        holderName = input.next();
        System.out.println(" please enter you expiry Date as \" dd-MM-yyyy\" ");
        expiryDate = input.next();
        System.out.println(" please enter you bank Name ");
        bankName = input.next();
    }

    public double getCardNo() {
        return cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getBankName() {
        return bankName;
    }

}
