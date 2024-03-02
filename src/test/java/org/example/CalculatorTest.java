package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

// Homework 5, point 3.3
    @Test
    public void checkingTheAdditionOfTwoPositiveNumbers()
    {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.calculateSumOfTwoIntegerValue(8, 4));
    }
    @Test
    public void checkingTheAdditionOfTwoNegativeNumbers ()
    {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.calculateSumOfTwoIntegerValue(-3, -3));
    }
    @Test
    public void checkingTheAdditionOfAPositiveNumberWithZero ()
    {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.calculateSumOfTwoIntegerValue(9, 0));
    }
    @Test
    public void checkingTheAdditionOfANegativeNumberWithZero ()
    {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.calculateSumOfTwoIntegerValue(-5, 0));
    }
    @Test
    public void checkingSubtractionOfTwoPositiveNumbers ()
    {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculateSubtractionBetweenTwoIntegerValues(10, 5));
    }

    @Test
    public void checkingSubtractionOfTwoNegativeNumbers ()
    {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.calculateSubtractionBetweenTwoIntegerValues(-8, -7));
    }

    @Test
    public void checkingSubtractionOfAPositiveNumberWithZero ()
    {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.calculateSubtractionBetweenTwoIntegerValues(8, 0));
    }
    @Test
    public void checkingSubtractionOfANegativeNumberWithZero ()
    {
        Calculator calculator = new Calculator();
        assertEquals(-7, calculator.calculateSubtractionBetweenTwoIntegerValues(-7, 0));
    }
    // Homework 5, point 4
    @Test
    public void checkingTheFirstNumberIsGreaterThanTheSecondIsTrue ()
    {
        Calculator calculator = new Calculator();
        assertTrue(5 > 3);
    }
    @Test
    public void checkingTheFirstNumberIsGreaterThanTheSecondIsFalse ()
    {
        Calculator calculator = new Calculator();
        assertFalse(5 > 7);
    }
    @Test
    public void checkingThatTheNumbersAreEqualIsTrue ()
    {
        Calculator calculator = new Calculator();
        assertTrue(5 == 5);
    }
    @Test
    public void checkingThatTheNumbersAreEqualIsFalse ()
    {
        Calculator calculator = new Calculator();
        assertFalse(5 == 7);
    }



}
