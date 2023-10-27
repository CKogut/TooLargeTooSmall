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
        int attempt = 1;


        if (guess == target){
            System.out.print("You got it. The number is " + target + " and took you 1 attempt to guess.");
        } else {
            do {
                if (guess > target) {
                    System.out.print("Too high, enter a new guess: ");
                    guess = scanner.nextInt();
                    attempt++;
                } else {
                    System.out.print("Too low, enter a new guess: ");
                    guess = scanner.nextInt();
                    attempt++;
                }
            } while (guess != target);

            System.out.print("You got it. The answer is " + target + " and took you " + attempt + " attempts.");
        }
    }
}
