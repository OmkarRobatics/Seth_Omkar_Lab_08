import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // sets up scanner class
        // var declarations
        boolean anotherItem = false;
        double priceOfItem = 1;
        double totalPrice = 0;
        do {

            priceOfItem = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 9.99); // safely prompts for price of item
            anotherItem = SafeInput.getYNConfirm(in, "Would you like to enter the price of another item? Enter Y for yes and N for no: "); // prompts user to enter price of another item
            totalPrice = totalPrice + priceOfItem; // adds to total price
        }while (anotherItem == true);
        System.out.println("The total price is $" + totalPrice); // displays total price

    }
}
