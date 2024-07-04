package org.basicCodingTraining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculate = true;

        while (continueCalculate){
            System.out.println("Input first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Input second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Input number to select method: [1.Add / 2.Subtract / 3.Multiply / 4.Divide]");
            int choice = scanner.nextInt();
            int result = 0;

            switch (choice) {
                    case 1 -> result = BasicCalculator.add(firstNumber, secondNumber);
                    case 2 -> result = BasicCalculator.subtract(firstNumber, secondNumber);
                    case 3 -> result = BasicCalculator.multiply(firstNumber, secondNumber);
                    case 4 -> result = BasicCalculator.divide(firstNumber, secondNumber);
                    default -> System.out.println("Invalid choice, please choose a method.");
                };
            System.out.println("Result: " + result);

            System.out.println("Calculate the next question? [Yes/No]");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("yes")){
                continueCalculate = false;
            }
        }
        scanner.close();
        System.out.println("Thanks for using basic calculator.");
    }
}