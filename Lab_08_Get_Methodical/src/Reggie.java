import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String ID = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in,"Enter Your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        ID = SafeInput.getRegExString(in,"Enter Your UC ID","^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in,"Enter Your Menu Choice","^[OoSsVvQq]$");

        System.out.println("Your social security number is " + SSN);
        System.out.println("Your UC ID number is " + ID);
        System.out.println("You Chose " + menuChoice);


    }
}
