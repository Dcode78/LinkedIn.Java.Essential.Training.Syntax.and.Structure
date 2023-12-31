package loops;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;
        //Create loop to iterate through all of the items and accumulate the costs
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter item price ");
            var itemPrice = scanner.nextDouble();
            total = total + itemPrice;
        }
        scanner.close();
        System.out.println("Total amount for the bill " + total);
    }
}
