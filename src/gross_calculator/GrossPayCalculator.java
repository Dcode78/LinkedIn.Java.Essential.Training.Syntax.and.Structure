package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        //1. Get the number of hours worked
        int hours =  0;
        System.out.println("How may hours did you work ?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        // var hours =  40; // type inferring is available with JDK10
        //2. Get the hourly pay rate
        double payRate = 25.50;
        System.out.print("What is your pay rate ? ");
        payRate = scanner.nextDouble();

        // var payRate = 25.50;
        //3. Multiply hours and pay rate
        double grossPay = payRate * hours;
        //4. Display result
        System.out.println("Gross Pay "+ grossPay);
    }
}
