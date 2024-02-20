package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //Create new object
        Calculator calculator = new Calculator();
        //call method
        System.out.println( "Run calculator: " + calculator.calculateSumOfTwoIntegerValues(5, 0));
    }
}
