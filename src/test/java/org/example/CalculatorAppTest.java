package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorAppTest {

    private Calculator calculator;
    @BeforeEach void setUp (){
        calculator = new Calculator();
        System.out.println("Setting up calculating methods before each test run");
    }


    @Test
    public void sumOfTwoIntegers() {
        int result = calculator.sumOfTwoIntegers(2,5);
        assertEquals(7,result);
    }

    @Test
    public void sumOfTwoNegativeNumbers () {
        int result = calculator.sumOfTwoIntegers(-3,-5);
        assertEquals(-8,result);
     }

    @Test
    public void sumOfTwoNumbers () {
        int result = calculator.sumOfTwoIntegers(10,0);
        assertEquals(10, result);
    }

    @Test
    public void sumOfNegativeAndPositiveNumbers () {
        int result = calculator.sumOfTwoIntegers(-4,8);
        assertEquals(4,result);
    }

    @Test
    public void subtractionOfTwoNumbers() {
        int result = calculator.subtractingOfTwoIntegers(10,5);
        assertEquals (5,result);
    }

    @Test
    public void subtractionOfTwoEqualNumbers() {
        int result = calculator.subtractingOfTwoIntegers(10,10);
        assertEquals(0,result);
    }

    @Test
    public void subtractionOfBiggerAndZeroValues() {
        int result = calculator.subtractingOfTwoIntegers(10,0);
        assertEquals(10,result);
    }

    @Test
    public void subtractionBiggerOfSmallNum() {
        int result  = calculator.subtractingOfTwoIntegers(5,10);
        assertEquals(-5, result);
    }


    @Test
    public void firstNumIsSmallerThanSecond () {
        boolean result = calculator.firstNumIsSmallerThanSecondNum(10,12);
        assertTrue(result);
    }

    @Test
    public void secondNumIsBiggerThanFirst () {
        boolean result = calculator.secondNumIsBiggerThanFirstNum(2,1);
        assertTrue(result);
    }

    @Test
    public void bothNumbersAreEqualToEachOther(){
        boolean result = calculator.sumOfTwoNumbersIsEqlToEachOther(10,10);
        assertTrue(result);
    }

    @Test
    public void firstNumIsNotEqualToSecondNum(){
        boolean result = calculator.firstNumIsNotEqualToSecondNum(5,7);
        assertTrue(result);
    }

    @Test
    public void biggerDoubleNumberDividedByDoubleSmaller(){
        double result = calculator.firstNumberDividedBySecondNumber(7.0,3.4);
        assertEquals(2.058823529411765, result, 0.001);
    }
    @Test
    public void smallerDoubleDividedByBiggerDouble() {
        double result = calculator.firstNumberDividedBySecondNumber(3.0,4.0);
        assertEquals(0.75, result, 0.001);
    }
    @Test
    public void negativeDoubleValueDividedByPositiveDoubleValue() {
        double result = calculator.firstNumberDividedBySecondNumber(-3.0,4.0);
        assertEquals(-0.75,result,0.001);
    }
    @Test
    public void positiveDoubleValueDividedByNegativeDoubleValue() {
        double result = calculator.firstNumberDividedBySecondNumber(3.0,-4.0);
        assertEquals(-0.75,result,0.001);
    }
    @Test
    public void twoDoubleNegativeValuesDividedBetweenThem(){
        double result = calculator.firstNumberDividedBySecondNumber(-3.1,-4.1);
        assertEquals(0.7560975609756099,result,0.001);
    }


    @Test
    public void multiplicationOfTwoNumbers(){
        double result = calculator.multiplicationOfTwoNumbers(6.1,4.3);
        assertEquals(26.229999999999997,result, 0.001);

    }
    @Test
    public void multiplicationOfNegativeDoubleValueAndPositiveDoubleValue(){
        double result = calculator.multiplicationOfTwoNumbers(-3.2,4.5);
        assertEquals(-14.4,result,0.001);
    }
    @Test
    public void multiplicationOfTwoDoubleNegativeValues(){
        double result = calculator.multiplicationOfTwoNumbers(-4.2,-3.3);
        assertEquals(13.86,result,0.001);
    }
    @Test
    public void multiplicationFirstDoubleValueToZeroValue(){
        double result = calculator.multiplicationOfTwoNumbers(4.2,0.0);
        assertEquals(0,result,0.001);
    }
}
