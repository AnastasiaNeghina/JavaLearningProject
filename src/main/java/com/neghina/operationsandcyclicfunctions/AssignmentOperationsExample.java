package com.neghina.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int c = 30;
        int d = 4;
        int e = 2;

//   Atribuire simpla
        int result = c;
        System.out.println("Atribuire simpla rezultat: " + result);
//   Atribuire cu adunare
        result += d;
        System.out.println("Atribuire cu adunare rezultat: " + result);
//   Atribuire cu scadere
        result -= e;
        System.out.println("Atribuire cu scadere rezultat: " + result);
//   Atribuire cu imultire
        result *= d;
        System.out.println("Atribuire cu inmultire rezultat: " + result);
//   Atribuire cu impartire
        result /= e;
        System.out.println("Atribuire cu impartire rezultat: " + result);
//   Atribuire cu restul impartirii
        result %= d;
        System.out.println("Atribuire cu restul impartirii rezultat: " + result);
    }
}