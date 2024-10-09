import java.util.Scanner;

public class SimpleInputLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int age = 0;
        double salary = 0;
        String trash = "";
        boolean doneAge = false;




        do {


            System.out.print("Enter your age:");
            if (in.hasNextInt()) {

                age = in.nextInt();
                in.nextLine(); // clear the buffer
                System.out.println("You said your age is " + age);
                doneAge = true;

            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a numerical value. Try again.");



            }

        }while(!doneAge);




    }
}