import java.util.Scanner;

public class SentenelInput {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int age = 0;
        double salary = 0;
        String trash = "";
        boolean doneGrades = false;


        do {


            System.out.print("Enter your age:");
            if (in.hasNextInt()) {

                age = in.nextInt();
                in.nextLine(); // clear the buffer
                System.out.println("You said your age is " + age);
                doneGrades = true;

            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a numerical value. Try again.");


            }

        } while (!doneGrades);


        // totalGrades += grade; is the same as totalGrades = totalGrades + grade;
        // numGrades++; is the same as numGrades + 1;
        // Casting: treating variables as different variables for mathematical purposes. Example: answer = (double) totalGrades / numGrades; the parenthesis are the cast and signify to the IDE to treat an integer as a double
        // instead of elseif try typing else if with a space, the compiler may have an issue with that specific syntax (elseif)
        // psvm TAB key = public static void main abbreviation. Make sure to add main method to a new class, as when you create a new class for a project it is initialized without a main method
        // create new projects without checking the boxes and then upload them to git via that way


    }
}