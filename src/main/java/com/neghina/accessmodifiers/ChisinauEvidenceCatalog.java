package com.neghina.accessmodifiers;

import com.neghina.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person person1 = new Person("Mihail", "Munteanu", 200435601);
        person1.isRetired = true;
        // instructiunea IF pentru proprietatea isRetired
        if (person1.isRetired) {
            // if true then
            System.out.println(person1.name + " este la pensie");
        } else {
            // if first condition is false then
            System.out.println(person1.name + " nu este la pensie");
        }

        Person person2 = new Person("Eugenia", "Stegarescu", 200423890);
        person2.isRetired = false;
        if (person2.isRetired) {
            System.out.println(person2.name + " este la pensie");
        } else {
            System.out.println(person2.name + " nu este la pensie");
        }

        Person person3 = new Person("Adela", "Golovco", 200421789);
        person3.isRetired = false;
        if (person3.isRetired) {
            System.out.println(person3.name + " este la pensie");
        } else {
            System.out.println(person3.name + " nu este la pensie");
        }

        Person person4 = new Person("Mihaiela", "Corobceanu", "femenin", 20, 200487523, true, false, "Mircea cel Batrin 21", 68123987);

        if (person4.isRetired) {
            System.out.println(person4.name + " este la pensie");
        } else {
            System.out.println(person4.name + " nu este la pensie");
        }

        Person person5 = new Person("Otilia", "Ungureanu", "femenin", 70, 200474125, true, true, "bd. Stefan cel Mare 3", 78369852);
        if (person5.isRetired) {
            System.out.println(person5.name + " este la pensie");
        } else {
            System.out.println(person5.name + " nu este la pensie");
        }

        Person person6 = new Person("Ion", "Croitoru", "male", 30, 200412365, false, false, "str. Trandafirilor 7", 69123456);
        if (person6.isRetired) {
            System.out.println(person6.name + " este la pensie");
        } else {
            System.out.println(person6.name + " nu este la pensie");
        }
    }
}