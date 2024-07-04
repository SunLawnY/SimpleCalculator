package org.basicCodingTraining;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        int firstNumber = 5;
        int secondNumber = 3;
        int expected = 8;

        // Act
        int result = BasicCalculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd_NegativeInput(){
        // Arrange
        int firstNumber = -5;
        int secondNumber = 3;
        int expected = -2;

        // Act
        int result = BasicCalculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        int firstNumber = 5;
        int secondNumber = 3;
        int expected = 2;

        // Act
        int result = BasicCalculator.subtract(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testSubtract_NegativeInput(){
        // Arrange
        int firstNumber = -5;
        int secondNumber = 3;
        int expected = -8;

        // Act
        int result = BasicCalculator.subtract(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        int firstNumber = 5;
        int secondNumber = 3;
        int expected = 15;

        // Act
        int result = BasicCalculator.multiply(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply_NegativeInput(){
        // Arrange
        int firstNumber = -5;
        int secondNumber = 3;
        int expected = -15;

        // Act
        int result = BasicCalculator.multiply(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply_NegativeInput2(){
        // Arrange
        int firstNumber = -5;
        int secondNumber = -3;
        int expected = 15;

        // Act
        int result = BasicCalculator.multiply(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }


    @Test
    public void testDivide() {
        // Arrange
        int firstNumber = 50;
        int secondNumber = 2;
        int expected = 25;

        // Act
        int result = BasicCalculator.divide(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testDivide_NegativeInput(){
        // Arrange
        int firstNumber = -50;
        int secondNumber = 2;
        int expected = -25;

        // Act
        int result = BasicCalculator.divide(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testDivide_NegativeInput2(){
        // Arrange
        int firstNumber = -50;
        int secondNumber = -2;
        int expected = 25;

        // Act
        int result = BasicCalculator.divide(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testDivide_DivideByZero(){
        // Arrange
        int firstNumber = -50;
        int secondNumber = 0;
        int expected = 0;

        // Act
        int result = BasicCalculator.divide(firstNumber, secondNumber);
        DividedByZeroException exception = assertThrows(DividedByZeroException.class, () -> {
            InputValidation.checkDivideValue(secondNumber);
        });

        // Assert
        assertEquals(expected, result);
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}