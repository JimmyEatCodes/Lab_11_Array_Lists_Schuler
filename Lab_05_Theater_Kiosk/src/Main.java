import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age, if you are over 21 you will be admitted:");

        int input = in.nextInt();

        if(input >= 21)
        {
            System.out.println("You are old enough to enter! Welcome to the theater");
        }

    }
}