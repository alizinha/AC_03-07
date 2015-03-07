package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison and Jaellys Bales on 3/7/15.
 */

import java.util.Scanner;

public class RPNCalculator {
    public static void main(String [] args) {
        int num1, num2;
        String operator;

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter your second number: ");
        num2 = input.nextInt();

        System.out.println("Please enter an operator (+, -, *, /, %): ");
        operator = input.next();
//we got help from Kevin about the "operator.equals" instead of using "==" for strings
        if (operator.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (operator.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (operator.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        }
        else if (operator.equals("/")) {
            System.out.println("Result: " + (num1 / num2));
        }
        //don't need to specify modulo because this is the last logical option
        else {
            System.out.println("Result: " + (num1 % num2));
        }

    }




}
