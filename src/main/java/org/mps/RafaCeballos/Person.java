package org.mps.RafaCeballos;

import java.util.List;

public class Person {
    private final String name;
    private final int age;
    private final String gender;


    public Person(String name, int age, String gender){
        if(name == null){
            throw  new RuntimeException("No ha insertado nombre");
        }
        this.name = name;
        if(age<0){
            throw  new RuntimeException("No ha insertado edad");
        }
        this.age=age;
        if(!gender.equalsIgnoreCase("Male") && gender.equalsIgnoreCase("Female")){
            throw new RuntimeException("No ha insertado el genero correcto");
        }
        this.gender=gender;
    }

    public String name(){
        return name;
    }

    public int age(){
        return age;
    }

    public String gender(){
        return gender;
    }

    public double[] averageAgePerGender(List<Person> persons){
        return null;
    }
}
