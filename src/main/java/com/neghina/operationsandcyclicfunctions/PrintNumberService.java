package com.neghina.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 100;
        int limit = 50;
        while (a > 0) {
            System.out.print(a + ", ");
            a--;
        }
        System.out.println();
        do {
            System.out.print(a + ", ");
            a++;
        } while (a < limit);
        System.out.println();
        for (int i = 1; i <= limit; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
    }
}
