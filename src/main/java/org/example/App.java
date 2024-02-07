package org.example;
public class App {
    public static void main( String[] args ) {
        var calc=new Calculator();
        System.out.println(calc.addition(-1, +5));
        System.out.println(calc.subtraction(5, 5));
        System.out.println(calc.isNum1Bigger(3,4));
    }
}
