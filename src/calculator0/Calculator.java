
/**
 * File: exceptions/Calculator.java Package: exceptions
 *
 * @author Christopher Williams Created on: Apr 18, 2016 Description: Create a
 * simple text-based calculator to add exception handling to
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // declare and initialize variables
        boolean stopInput = false;
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        char operation = 0;
        boolean lstopInput = false;
        do {
            try {

                // The result of the operation
                int result = 0;
                // read in operands and operation from user
                System.out.print("Enter an integer (operand 1) and press Enter: ");

                num1 = scanner.nextInt();

                System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
                operation = scanner.next().charAt(0);

                System.out.print("Enter an integer (operand 2) and press Enter: ");
                num2 = scanner.nextInt();
                lstopInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Use integer values for operands");
                scanner.next();
            }
        } while (!lstopInput);
        // close scanner when done
        scanner.close();

        //The result of the operation
        int result = 0;

        // Determine the operator
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        // Display result
        System.out.println(num1 + " " + operation + " " + num2
                + " = " + result);
    }
}
