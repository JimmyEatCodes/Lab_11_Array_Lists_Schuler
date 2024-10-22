import java.util.Random;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();

        int die1 = -1;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        int rollCount = 0;

        System.out.println("Roll    Die1    Die2    Die3    Total");
        System.out.println("=====================================");
        while(die1 != die2 || die2 != die3)
        {
            rollCount++;

            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;

            dieRoll = die1 + die2 + die3;

            System.out.printf("%3d\t\t%3d\t\t%3d\t\t%3d\t\t%3d\n", rollCount, die1, die2, die3, dieRoll);


        }




    }

}
