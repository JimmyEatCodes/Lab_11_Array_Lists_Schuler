import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int highValue = 0;
        int year = 0;
        int hour = 0;
        int day = 0;
        int minute = 0;
        int month = 0;

        year = SafeInput.getRangedInt(in, "Enter the birth year",1950,2015);
        month = SafeInput.getRangedInt(in, "Enter the birth month",1,12);


        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                highValue = 31;
                break;
            case 2:
            case 6:
            case 9:
            case 11:
                highValue = 29;
                break;
            case 4:

                highValue = 30;
                break;

        }
        day = SafeInput.getRangedInt(in, "Enter the birth day",1, highValue);
        hour = SafeInput.getRangedInt(in, "Enter the birth hour",1,24);
        minute = SafeInput.getRangedInt(in, "Enter the birth minute",0,59);

        System.out.println("The date of birth entered is " + month + " " + day + " " + year + ", the time of birth was " + hour + ":" + minute );
    }
}
