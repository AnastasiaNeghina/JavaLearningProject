package com.neghina.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 7;

//   Increment operation - val var este utilizata in expresie inainte de a fi incrementata
        a++; /* a=8 */
        System.out.println("Valoarea lui a: " + a);
//   Pre - increment operation - val var se mareste inainte de a fi utiliz in expresie
        ++a; /* a=9 */
        int b = ++a; /* a,b=10 */
        int a1 = a; /* a=10 */
        int c = a++; /* a=11, c=10) */
        System.out.println("Valoarea lui a dupa incrementare pre-fixata: " + a);
        System.out.println("In timp ce b: " + b + ", a1= " + a + ", c= " + c);
//   Decrement operation
        a--;
        System.out.println("Valoarea lui a dupa decremrentare: " + a);
//   Pre - decrement operation
        --a; /* a=9 */
        System.out.println("Valoarea lui a dupa decrementare pre-fixata:" + a);
    }
}