import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // sets up scanner class
       int num =  SafeInput.getInt(in,"Enter you favorite integer number"); // prompts user for favorite integer
       double dub = SafeInput.getDouble(in, "Enter your favorite double number"); // prompts user for favorite double
        System.out.println("Your favorite integer number is " + num +"." + " Your favorite double number is " + dub); // displays favorite numbers
    }
}
