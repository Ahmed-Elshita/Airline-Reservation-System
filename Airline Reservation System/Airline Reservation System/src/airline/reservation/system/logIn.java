
package airline.reservation.system;
import java.util.Scanner;

public class logIn {
    
    Scanner input = new Scanner(System.in);
    private String userName;
    private String pass;
    
    
    logIn(){
        
     System.out.println("please enter your user name");
     userName= input.next();
      System.out.println("please enter your password");
     pass= input.next();
     
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }
    
    
    
}
