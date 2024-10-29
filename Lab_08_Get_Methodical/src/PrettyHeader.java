import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = SafeInput.getNonZeroLenString(in,"Enter message to display");

        prettyHeader(message);
    }
    public static void prettyHeader(String msg)
    {
        int totalSpaces = 54 - msg.length();
        int space1 = totalSpaces / 2;
        int space2 = space1;

        if(totalSpaces % 2 == 1)
            space2++;

        for(int s = 1; s <= 60; s++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int s = 1; s <= 3; s++)
        {
            System.out.print("*");
        }

        for(int sp = 1; sp <= space1; sp++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for(int sp = 1; sp <= space2; sp++)
        {
            System.out.print(" ");
        }
        for(int s = 1; s <= 3; s++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int s = 1; s <= 60; s++)
        {
            System.out.print("*");
        }
    }

}
