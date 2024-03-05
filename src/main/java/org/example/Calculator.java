package org.example;

public class Calculator {
    public int calculateSumOfTwoIntegerValues(int firstValue, int secondValue) {
        return firstValue + secondValue;
        //int sum = firstValue + secondValue;
        //return sum;
    }

    public int calculateSubtractionOfTwoIntegers(int thirdValue, int fourthValue) {
        return thirdValue - fourthValue;
    }

    public boolean returnCompareResult(int a, int b) {
        return a < b;
    }

    public double calculateDivisionOfTwoValues(double a, double b, double delta) {
        if (b == 0) {
            throw new IllegalArgumentException("Not possible to divide on a zero");
        }
        return a / b;
    }

    public double calculateMultiplicationOfTwoValues(double a, double b, double delta) {
        return a * b;
    }
    public double calculateDivisionOfZeroValue(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Not possible to divide on a zero");
        }
        return x / y;
    }
}
