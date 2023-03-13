import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // sets up scanner class
        // prompts safely for birth date and time
        int birthMonth =  SafeInput.getRangedInt(in, "What is your birth month",1,12);
        int birthYear =  SafeInput.getRangedInt(in, "What is your birth year",1950,2010);
        int birthHour =  SafeInput.getRangedInt(in, "What is your birth hour",1,24);
        int birthMinute =  SafeInput.getRangedInt(in, "What is your birth minute",1,59);
        int birthDay = 1; // declares birth day var


        switch (birthMonth)
        {
            case 1,3,5,7,8,10,12: // 31 day months
              birthDay = SafeInput.getRangedInt(in,"Enter your birthday",1,31); // sets hi to 31
                break;
            case 2: // 29 day month
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday",1,29); // sets hi to 29
                break;
            case 4,6,9,11: // 30 day months
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday",1,30); // sets hi to 30
                break;
        }
        System.out.println("Your birth date is: " + birthMonth + "/" + birthDay + "/" + birthYear + " Your birth time is: " + birthHour + ":" + birthMinute ); // displays birth date and time

    }
}
