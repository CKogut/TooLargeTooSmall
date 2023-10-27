/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        // Create logger
        Logger logger=Logger.getLogger(Main.class.getName());

        // create instance of Random class
        Random rand = new Random();

        //Get random number between 1 and 10
        int target = rand.nextInt(10)+1;

        //Check what the number is
        logger.info(String.valueOf(target));

        // Create scanner
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        do {
            if (guess > target) {
                System.out.print("Too high, enter a new guess: ");
                guess = scanner.nextInt();
            } else {
                System.out.print("Too low, enter a new guess: ");
                guess = scanner.nextInt();
            }
        } while (guess != target);

        System.out.print("You got it, the answer is " + target + "!");


    }
}
