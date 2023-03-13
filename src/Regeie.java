import java.util.Scanner;

public class Regeie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // sets up scanner class
        String ssn = SafeInput.getRegexString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}"); // inputs ssn
        System.out.println("Your SSN number is: " + ssn); // outputs ssn
        String ucStudentMNumber = SafeInput.getRegexString(in, "Enter your student M number", "(M|m)\\d{5}"); // inputs UC number
        System.out.println("Your UC Number is: " + ucStudentMNumber); // outputs UC number
        String menu = SafeInput.getRegexString(in,"Chose a option from the menu: Open - O, Save - S, V - view, Q - quit","[OoSsVvQq]"); // inputs menu choice
        if(menu.equalsIgnoreCase("o"))
        System.out.println("Open"); // outputs Open for o
        else if (menu.equalsIgnoreCase("s"))
        {
            System.out.println("Save"); // outputs Save for s
        }
        else if (menu.equalsIgnoreCase("v")) // outputs View for v
            System.out.println("View");
        else
        {
            System.out.println("Quit"); // outputs Quit for q
        }

    }
}
