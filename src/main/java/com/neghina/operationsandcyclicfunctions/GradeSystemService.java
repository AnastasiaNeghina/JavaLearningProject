package com.neghina.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 57;

        if (testResult >= 90) {
            System.out.println("Calificativul A");
        } else if (testResult >= 80) {
            System.out.println("Calificativul B");
        } else if (testResult >= 75) {
            System.out.println("Calificativul C");
        } else if (testResult >= 50) {
            System.out.println("Calificativul D");
        } else {
            System.out.println("Nu a fost definit un astfel de calificativ");
        }
        System.out.println("Procesul s-a terminat");
    }

}