package org.example;

import org.mps.RafaCeballos.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personas = new ArrayList<>();
        Person persona1 = new Person("Rafa",20,"Male");
        Person persona2 = new Person("Alberto",21,"Male");
        Person persona3 = new Person("Ramon",19,"Male");
        Person persona4 = new Person("ALba",40,"Female");
        Person persona5 = new Person("Maria",41,"Female");
        Person persona6 = new Person("Alice",39,"Female");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);

        double[] res = new double[2];
        res[0] = Person.averageAgePerGender(personas)[0];
        res[1] = Person.averageAgePerGender(personas)[1];

        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}