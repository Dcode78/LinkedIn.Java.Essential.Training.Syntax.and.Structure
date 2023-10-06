package methods;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that greets a user by name.
 */
public class Greetings {
        static String name = "class level";

    public static void main(String args[]){
        greetUser();
    }

    public static void greetUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();
        System.out.println("Hi there, " + name);
        System.out.print(String.format("Hi there, %#d: class variable %d ", name, name));
    }
}
