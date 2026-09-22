import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double itemPrice;
        double SHIPPING_RATE = 0.02;
        double finalCost;

        System.out.println("What is the price of your item?");

        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
            if (itemPrice >= 100) {
                System.out.println("Your shipping is free. Your cost will be " + itemPrice + ".");
            }
            else if (itemPrice > 0) {
                finalCost = itemPrice + (SHIPPING_RATE * itemPrice);
                System.out.println("Your shipping is not free. Your total cost, including shipping, will be " + finalCost + ".");
            }
            else {
                System.out.println("You inputted an invalid price. Please try again later.");
                System.exit(0);
            }
        }
        else {
            System.out.println("You inputted an invalid data type. Please input a valid number next time.");
            System.exit(0);
        }

    }
}
