package com.neghina.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    //    Declararea si initializarea unui obiect static Random
    private static Random random = new Random();

    //    Definirea a 3 metode statice, folosind principiul overloading
    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Min value should be smaller than the max value");
            return 0;
        }
        int delta = max - min;
        int deltaRandomnInt = random.nextInt(delta);
        int randomNumber = deltaRandomnInt + min;
        return randomNumber;
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int getRandomInt() {
        return random.nextInt();
    }

    //    Definirea unei metode statice ce va returna o valoare String - e-mail unic
    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@neg.com";
        return uuid + domain;
    }

    //    Definirea unei metode care va genera un String random valid
    public static String generateValidRandomString(int lenght) {
        String acceptedChars = "QWERTYUIOPASDFGHJKLZXCVBNMmnbvcxzlkjhgfdsapoiuytrewq";
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 0; a < lenght; a++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: a = " + a + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
//    public static String generateInvalidRandomString(int lenght) {
//        String acceptedChars = "!£$%&/()=?^";
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int b = 0; b < lenght; b++) {
//            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
//            stringBuilder.append(acceptedChars.charAt(randomIndex));
//            System.out.println("In iteratia: b = " + b + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
//        }
//        return stringBuilder.toString();
//    }

    //    metoda statica pentru a genera un random double
    public static double getRandomDouble(double limit) {
        if (limit <= 18) {
            System.out.println("Limita trebuie sa fie pozitiva, mai mare ca 18");
            return 0;
        }
        return random.nextDouble() * limit;
    }

    //    metoda statica pentru a genera un random boolean
    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}