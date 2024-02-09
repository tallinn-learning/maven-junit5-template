package org.example;


public class CalculatorApp
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumOfTwoIntegers(4,4));
        System.out.println(calculator.subtractingOfTwoIntegers(10,5));
        System.out.println(calculator.sumOfTwoNumbersIsEqlToEachOther(10,10));
        System.out.println(calculator.firstNumIsSmallerThanSecondNum(6,4));
        System.out.println(calculator.secondNumIsBiggerThanFirstNum(3,1));
    }
}
