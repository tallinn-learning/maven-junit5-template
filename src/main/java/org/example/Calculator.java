package org.example;

public class Calculator {

    public int sumOfTwoIntegers (int num1, int num2){
        return num1 + num2;
    }

    public int subtractingOfTwoIntegers ( int num1, int num2){
        return num1-num2;
    }

    public boolean sumOfTwoNumbersIsEqlToEachOther (int num1, int num2) {
        return num1==num2;
    }

    public boolean firstNumIsSmallerThanSecondNum (int num1, int num2 ) {
      return num1 < num2;
    }

    public boolean secondNumIsBiggerThanFirstNum (int num2,int num1){
        return num2 > num1;
    }

    public boolean firstNumIsNotEqualToSecondNum (int num1, int num2){
        return num1 != num2;
    }
    public double firstNumberDividedBySecondNumber (double num3,double num4){
        return num3/num4;
    }
    public double multiplicationOfTwoNumbers (double num3, double num4){
        return num3*num4;
    }


}
