package decision_structures;

import java.util.Scanner;

public class GradeMessage3 {

    public static void main(String[] args){

        System.out.print("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();
        scanner.close();

        var castAscii = (int) grade.charAt(0);

        String message = switch(grade){
            case "A" -> {
                System.out.println("Excellent job!");
                yield String.valueOf(castAscii * 0.25);
            }
            case "B" -> {
                System.out.println("Great job!");
                yield String.valueOf(castAscii * 0.2);
            }
            case "C" ->  {
                System.out.println("Good job!");
                yield String.valueOf(castAscii * 0.15);
            }
            case "D" ->  {
                System.out.println("You need to work a bit harder");
                yield String.valueOf(castAscii * 0.1);
            }
            case "F" -> {
                System.out.println("Uh oh!");
                yield String.valueOf(castAscii * 0.05);
            }
            default -> "Error. Invalid grade";
        };
        System.out.println(message);
    }
}
