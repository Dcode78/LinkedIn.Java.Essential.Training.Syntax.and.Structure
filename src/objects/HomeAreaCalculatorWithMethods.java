package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        double area = calculateTotalFloorArea(kitchen, bathroom);
        System.out.println("Total area  : " + area);
        scanner.close();
        }

    public static double calculateTotalFloorArea(Rectangle r1, Rectangle r2){
        return r1.calculateArea() + r2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.print("Enter the length of your room : ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of your room  : ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}