package loops;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 2;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++){
            double total =0;
            System.out.println("Enter marks for student " + (i+1));
            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Enter marks for test " + (j+1) + " out of "+ numberOfTests);
                double score = scanner.nextDouble();
                total = total + score;
            }
            double avgMarks = total/numberOfTests;
            System.out.println("Average marks for student "+ (i+1) + " is " + avgMarks);
        }
        scanner.close();
    }
}