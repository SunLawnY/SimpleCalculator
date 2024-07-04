package org.basicCodingTraining;

import java.util.Scanner;

public class BasicCalculator {

    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
            try {
                InputValidation.checkDivideValue(secondNumber);
                return firstNumber / secondNumber;
            } catch (DividedByZeroException e) {
                System.out.println("Cannot divided by zero");
                return 0;
            }
    }
}
