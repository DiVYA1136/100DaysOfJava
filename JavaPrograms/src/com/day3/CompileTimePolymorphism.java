package com.day3;

class Calculator {


    int add(int a, int b) {
        return a + b;
    }

 
    int add(int a, int b, int c) {
        return a + b + c;
    }

    
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Sum of two integers: " + cal.add(10, 20));
        System.out.println("Sum of three integers: " + cal.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + cal.add(10.5, 20.8));
    }
}