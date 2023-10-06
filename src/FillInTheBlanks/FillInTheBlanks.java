package FillInTheBlanks;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {

        String adjective;

        System.out.print("Enter a adjective ");
        Scanner scanner = new Scanner(System.in);
        adjective = scanner.nextLine();

        String season;
        System.out.print("Enter a season ");
        season = scanner.nextLine();

        int number;
        System.out.print("Enter number ");
        number = scanner.nextInt();

        scanner.close();

        System.out.println("On a(n) " + adjective +  " " + season + " day, I drink a minimum of "
                + number + " cups of coffee.");
    }

}
