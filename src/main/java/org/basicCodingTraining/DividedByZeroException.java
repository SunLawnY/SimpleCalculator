package org.basicCodingTraining;

public class DividedByZeroException extends ArithmeticException{
    public DividedByZeroException(){
        super("Division by zero is not allowed.");
    }
}
