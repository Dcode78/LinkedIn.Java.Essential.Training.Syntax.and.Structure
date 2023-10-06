package loops;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        var tot = 0.0;
        var loopContinue = 0;
        double [] n = new double[3];
        int x =1;

        do{
            for (int i = 0; i < 2; i++){
                System.out.print("Enter Number " + (i+1)+" ");
                for (; x < 3; x++){
                    n[x] = scanner.nextDouble();
                    tot = tot + n[x];
                    break;
                }

            }
            System.out.println("Total is " + tot);

            System.out.println("Want to Continue ? . . . Enter 1 | Enter 2 to Exit ");
            loopContinue = scanner.nextInt();

        }while (loopContinue == 1);
        scanner.close();
    }
}