import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;


        favInt = SafeInput.getInt(in, "Enter Your Favorite Integer");
        favDouble = SafeInput.getDouble(in, "Enter Your Favorite Double");

        System.out.println("You said your favorite int was " + favInt);
        System.out.println("You said your favorite double was " + favDouble);
    }
}
