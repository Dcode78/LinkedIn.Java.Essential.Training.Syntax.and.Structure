package methods;

import java.util.Scanner;

/*
 * PASSING ARGUMENTS TO METHODS
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    public static void main(String args[]){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        System.out.print("Your application ");
       /* boolean qualified = isUserQualified(salary, creditScore);
        nofifyUser(qualified);*/

        nofifyUser(isUserQualified(salary, creditScore));

        //Check if the user is qualified
    }
    public static boolean isUserQualified(double salary, int creditScore){
        double salaryLimit = 5000.00;
        int reqCreditScore = 35;
        if (salary >= salaryLimit && creditScore >= reqCreditScore){
            return true;
        }
        else
            return false;
    }

    public static void nofifyUser(boolean result){
        if (result)
            System.out.println("Qualified");
        else
            System.out.println("Declined");
    }

}