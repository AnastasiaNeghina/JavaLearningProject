package com.neghina.operationsandcyclicfunctions;

public class AritmeticOperationsExample {
    public static void main(String[] args) {
        int a = 122;
        int b = 7;

//   Sum operation
        int sum = a + b;
        System.out.println("Rezultatul sumei: " + sum);
        System.out.println("Rezultatul sumei: " + (a + b));
//   Substraction operation
        int sub = a - b;
        System.out.println("Rezultatul diferentei: " + sub);
        System.out.println("Rezultatul diferentei: " + (a - b));
//   Multiplication operation
        int result = a * b;
        System.out.println("Rezultatul inmultirii: " + result);
//   Devision operation
        result = a / b;
        System.out.println("Rezultatul impartirii: " + result);
//   The rest from division
        result = a % b;
        System.out.println("Restul impartirii: " + result);
    }
}