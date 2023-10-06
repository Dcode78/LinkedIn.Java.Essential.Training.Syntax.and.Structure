package text_processing;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("I love Java");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        String [] s = text.split(" ");
        int lengthOfS = s.length;
        String msg = String.format("Text contains %d words", lengthOfS);
        System.out.println(msg);
            for(int i =0; i < lengthOfS; i++){
                System.out.println(s[i]);
            }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i = text.length() -1; i >= 0; i-- ){
            System.out.print(text.charAt(i));
        }
    }

}