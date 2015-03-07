package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison and Jaellys Bales on 3/7/15.
 */

import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String [] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please ask me a yes or no question about your future.");
        input.next();

        Random random = new Random();
        int answerValue = random.nextInt(5);

        if (answerValue == 0) {
            System.out.println("Maybe someday.");
        }
        else if (answerValue == 1) {
            System.out.println("Never in a million years, my child.");
        }
        else if (answerValue == 2) {
            System.out.println("Don't let anyone tell you otherwise: YES.");
        }
        else if (answerValue == 3) {
            System.out.println("The stars point to no.");
        }
        else {
            System.out.println("I'm just not in the mood to be witty. Ask again later.");
        }

    }


}
