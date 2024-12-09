import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double rWidth = 0;
        double rHeight = 0;
        int rArea = 0;
        int rPerimeter = 0;
        int rDiagonal = 0;
        String trash = "";
        boolean doneWidth = false;
        boolean doneHeight = false;

        do {

            System.out.print("Enter the Width of the rectangle: ");
            if (in.hasNextDouble())
            { rWidth = in.nextDouble();
                in.nextLine();
                doneWidth = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneWidth);

        do {

            System.out.print("Enter the Height of the rectangle: ");
            if (in.hasNextDouble())
            { rHeight = in.nextDouble();
                in.nextLine();
                doneHeight = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }

        }while(!doneHeight);

        rArea = (int) (rHeight * rWidth);
        rPerimeter = (int) (rWidth + rWidth + rHeight + rHeight);
        rDiagonal = (int) Math.sqrt(rWidth * rWidth + rHeight * rHeight);

        System.out.println("With a Height of " + rHeight + " and a Width of " + rWidth + ", the area of the rectangle is " + rArea + ".");
        System.out.println("With a Height of " + rHeight + " and a Width of " + rWidth + ", the perimeter of the rectangle is " + rPerimeter + ".");;
        System.out.println("With a Height of " + rHeight + " and a Width of " + rWidth + ", the diagonal of the rectangle is " + rDiagonal + ".");;
    }

}

