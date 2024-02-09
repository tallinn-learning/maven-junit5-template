package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorAppTest {

    @Test
    public void sumOfTwoIntegers() {   //
        Calculator calculator = new Calculator();
        int result = calculator.sumOfTwoIntegers(2,5);
        assertEquals(7,result);
    }

    @Test
    public void sumOfTwoNegativeNumbers () { //
        Calculator calculator = new Calculator();
        int result = calculator.sumOfTwoIntegers(-3,-5);
        assertEquals(-8,result);
     }

    @Test
    public void sumOfTwoNumbers () {  //
        Calculator calculator = new Calculator();
        int result = calculator.sumOfTwoIntegers(10,0);
        assertEquals(10, result);
    }

    @Test
    public void sumOfNegativeAndPositiveNumbers () {   //
        Calculator calculator = new Calculator();
        int result = calculator.sumOfTwoIntegers(-4,8);
        assertEquals(4,result);
    }

    @Test
    public void subtractionOfTwoNumbers() {  //
        Calculator calculator = new Calculator();
        int result = calculator.subtractingOfTwoIntegers(10,5);
        assertEquals (5,result);
    }

    @Test
    public void subtractionOfTwoEqualNumbers() { //
        Calculator calculator = new Calculator();
        int result = calculator.subtractingOfTwoIntegers(10,10);
        assertEquals(0,result);
    }

    @Test
    public void subtractionOfBiggerAndZeroValues() { //
        Calculator calculator = new Calculator();
        int result = calculator.subtractingOfTwoIntegers(10,0);
        assertEquals(10,result);
    }

    @Test
    public void subtractionBiggerOfSmallNum() { //
        Calculator calculator = new Calculator();
        int result  = calculator.subtractingOfTwoIntegers(5,10);
        assertEquals(-5, result);
    }


    @Test
    public void firstNumIsSmallerThanSecond () { //
        Calculator calculator = new Calculator();
        boolean result = calculator.firstNumIsSmallerThanSecondNum(10,12);
        assertTrue(result);
    }

    @Test
    public void secondNumIsBiggerThanFirst () { //
        Calculator calculator = new Calculator();
        boolean result = calculator.secondNumIsBiggerThanFirstNum(10,8);
        assertTrue(result);
    }

    @Test
    public void bothNumbersAreEqualToEachOther(){
        Calculator calculator = new Calculator();
        boolean result = calculator.sumOfTwoNumbersIsEqlToEachOther(10,10);
        assertTrue(result);
    }

    @Test
    public void firstNumIsNotEqualToSecondNum(){
        Calculator calculator = new Calculator();
        boolean result = calculator.firstNumIsNotEqualToSecondNum(5,7);
        assertTrue(result);
    }





}
