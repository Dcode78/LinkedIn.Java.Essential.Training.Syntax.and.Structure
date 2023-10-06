package loops;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int totalRolls = 5;
        int playerProgress = 0;
        int currentRollNumber = 0;
        int currentRollResult = 0;
        int gameSpace = 20;

        Random random = new Random();

        for (int i = 0; i < totalRolls; i++){
            currentRollNumber++;
            currentRollResult = random.nextInt(6) + 1;
            playerProgress = playerProgress + currentRollResult;
            if (gameSpace - playerProgress == 0 && currentRollNumber == 5) {
                System.out.println("Result for roll number [#" + currentRollNumber + "] You Rolled a " + currentRollResult +
                        " you are now on space " + playerProgress + " Congrats, you win !!!.");
                break;
            } else if (((gameSpace - playerProgress) < 0 && currentRollNumber == 5) || ((gameSpace - playerProgress) > 0 && currentRollNumber == 5)){
                System.out.println("Result for roll number [#" + currentRollNumber + "] You Rolled a " + currentRollResult +
                        " you loose ...! ");
                break;
            } else  {
                System.out.println("Result for roll number [#" + currentRollNumber + "] You Rolled a " + currentRollResult +
                        " you are now on space " + playerProgress + " and have " + (gameSpace - playerProgress) + " more to go.");
            }

        }

    }

}
