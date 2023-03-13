import java.util.Scanner;

public class Regeie {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegexString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        String ucStudentMNumber = SafeInput.getRegexString(in, "Enter your student M number", "(M|m)\\d{5}");
        String menu = "O - open, S - save, V - view, Q - quit";
        String menuChoice;
        System.out.print("Chose something from the menu" + menu);
        menuChoice = in.nextLine();
        menuChoice.toUpperCase();
        switch (menuChoice) {
            case "O":
                System.out.println("open");
                break;
            case "S":
                System.out.println("save");
                break;
            case "V":
                System.out.println("view");
            case "Q":
                System.out.println("quit");
        }
    }
}
