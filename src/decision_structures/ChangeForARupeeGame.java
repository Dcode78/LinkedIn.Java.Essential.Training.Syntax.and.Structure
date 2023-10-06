package decision_structures;

import java.util.Scanner;

public class ChangeForARupeeGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of 1 rupee coins ");
        var rupeeOne = scanner.nextInt();
        System.out.println("Enter number of 2 rupee coins ");
        var rupeeTwo = scanner.nextInt();
        System.out.println("Enter number of 5 rupee coins ");
        var rupeeFive = scanner.nextInt();
        System.out.println("Enter number of 10 rupee coins ");
        var rupeeTen = scanner.nextInt();
        scanner.close();

        var rupeesInTot = (rupeeOne + (rupeeTwo*2) +(rupeeFive * 5) + (rupeeTen * 10));

        if (rupeesInTot < 100){
            double shorterBy = 100 - rupeesInTot;
            System.out.println("Less than Rs. 100.00, short by " + shorterBy);
        }
        else if (rupeesInTot > 100) {
            double overBy = rupeesInTot - 100;
            System.out.println("More than Rs. 100.00, over by " + String.format("%,1f", overBy)+" rupees");
        }
            else
            System.out.println("Yay that's exactly Rs. 100.00! You win ");
    }
            
}

