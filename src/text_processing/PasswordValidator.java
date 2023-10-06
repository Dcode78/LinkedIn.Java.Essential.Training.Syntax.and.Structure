package text_processing;

import java.util.Scanner;

public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);
    static String newPwd;
    static String userName = "johndoe";
    static String oldPwd = "ABC_1234";
    static int pwdLength = 8;
    static boolean pwdValidity;

    public static void main(String[] args) {
        do {
            getNewPwd();
            System.out.println(newPwd);
            verifyPwdComplexity();
            System.out.println("New password validity : " + pwdValidity);
        }while (! pwdValidity);

    }
    static void getNewPwd(){
        System.out.print("Enter your New password : ");
        newPwd = scanner.nextLine();
    }

    static void verifyPwdComplexity() {

            boolean verifyNoUserName = verifyNoUserName();
            boolean verifyContainsSPChar = verifyContainsSPChar();
            boolean verifyContainsUpperCase = verifyContainsUpperCase();
            boolean verifyLength = verifyLength();
            boolean verifyNoOldPwd = verifyNoOldPwd();

            if (verifyNoUserName && verifyContainsSPChar && verifyContainsUpperCase && verifyLength && verifyNoOldPwd)
                pwdValidity = true;
    }

    private static boolean verifyNoUserName() {
        if ((newPwd.contains(userName))) {
            System.out.println("Failing for old user name");
            return false;
        }
        else{
            return true;
        }

    }

    private static boolean verifyContainsSPChar() {
        if(newPwd.matches("[a-zA-Z0-9]*")) {
            System.out.println("Failing for special character");
            return false;
        }
        else
            return true;
    }

    private static boolean verifyContainsUpperCase() {
        for(int i = 0; i < newPwd.length(); i++){
            char c = newPwd.charAt(i);
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        System.out.println("Failing for no uppercase");
        return false;
    }

    private static boolean verifyLength() {
        if (newPwd.length() >= pwdLength )
            return true;
        else{
            System.out.println("Failing for password length");
            return false;
        }
    }

    private static boolean verifyNoOldPwd() {
        if (newPwd.equals(oldPwd)) {
            System.out.println("Failing for old password");
            return false;
        }
        else
            return true;
    }

}
