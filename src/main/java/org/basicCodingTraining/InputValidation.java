package org.basicCodingTraining;

public class InputValidation {

    public static void checkDivideValue(int input){
        if (input == 0){
            throw new DividedByZeroException();
        }
    }

}
