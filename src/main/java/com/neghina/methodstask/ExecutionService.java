package com.neghina.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
//        Apelarea si generarea metodelor statice definite in clasa DataGeneratorUtil
        int randomInt = DataGeneratorUtil.getRandomInt(100, 300);
        System.out.println("Variabila randomInt: " + randomInt);
        int randomInt2 = DataGeneratorUtil.getRandomInt(100);
        System.out.println("Variabila randomInt: " + randomInt2);
        int randomInt3 = DataGeneratorUtil.getRandomInt();
        System.out.println("Variabila randomInt: " + randomInt3);
        System.out.println();
        System.out.println("Random E-mail: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random E-mail: " + DataGeneratorUtil.getRandomEmail());
        System.out.println();
        System.out.println("Random valid String de 52 chars: " + DataGeneratorUtil.generateValidRandomString(5));
        System.out.println("Random valid String de 52 chars:" + DataGeneratorUtil.generateValidRandomString(6));
        System.out.println();
//        System.out.println("Random invalid String de 12 chars: " + DataGeneratorUtil.generateInvalidRandomString(5));
//        System.out.println("Random invalid String de 12 chars: " + DataGeneratorUtil.generateInvalidRandomString(3));
//        System.out.println();
        double randomDouble = DataGeneratorUtil.getRandomDouble(7);
        System.out.println("Random Double: " + randomDouble);
        System.out.println();
        System.out.println("Random Boolean:" + DataGeneratorUtil.getRandomBoolean());
        System.out.println();

        Customer customer1 = new Customer("Mihai", 36, "mihaicorobceanu@neg.com");
        System.out.println("Nume customer 1: " + customer1.getName());
        System.out.println("Age customer 1: " + customer1.getAge());
        System.out.println("Email customer 1: " + customer1.getEmail());
        System.out.println();

        customer1.setName("Mihail");
        customer1.setAge(17);
        customer1.setEmail("mihail.c@neg.com");
        System.out.println("Nume customer 1: " + customer1.getName());
        System.out.println("Age customer 1: " + customer1.getAge());
        System.out.println("Email customer 1: " + customer1.getEmail());
        System.out.println();

// valori random
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(5), DataGeneratorUtil.getRandomInt(),
                DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
        System.out.println();
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(4));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 75));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
    }
}