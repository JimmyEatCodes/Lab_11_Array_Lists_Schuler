import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double total = 0;
        int itemCount = 0;
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in,"Enter the item price",0.50,10.00);
            total += itemPrice;
            itemCount++;

            done = SafeInput.getYNConfirm(in,"Are you done?");
        }while(!done);
        System.out.println("The total of these " + itemCount + " items is " + total);
    }
}
