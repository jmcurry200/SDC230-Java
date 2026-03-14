/*****************************
 * Name:  Jenice Curry
 * Date:  03/11/26
 * Assignment:  SDC230L - 1.4 Project - User Interactions and I/O
 */

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) throws Exception {
      
        System.out.println("This is Week 1 of my Calculator Project.");
        System.out.println("Jenice Curry / 1.4 User Interactions and I/O");
        System.out.println("This calculator will perform integer and floating point operations.");
        System.out.println("You may enter two numbers and your choice of operation. (Addition or subtraction)");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A for Addition or B for Subtraction.");
        char choice = input.next().toUpperCase().charAt(0);

        Calculator calc = new Calculator();  
        calc.readInput();
        

        if (choice == 'A') {
            calc.displayAddition();
        } else if (choice == 'B') {
            calc.displaySubtraction();
        } else {
            System.out.println("Please enter A or B.");
        }
    }

        private String name;
        private double number1;
        private double number2;

        public void readInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        number2 = input.nextDouble();
    }

    public double addNumbers() {
        return number1 + number2;
    }

    public double subtractNumbers() {
        return number1 - number2;
    }

    public void displayAddition() {
        System.out.println("Hello, " + name + "!");
        System.out.println("The answer is " + addNumbers() + " Thank you for using this calculator.");
    }

    public void displaySubtraction() {
        System.out.println("Hello, " + name + "!");
        System.out.println("The answer is " + subtractNumbers() + " Thank you for using this calculator.");
        }
}
