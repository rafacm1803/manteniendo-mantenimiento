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
        if(age <= 0){
            throw  new RuntimeException("Edad incorrecta");
        }
        this.age=age;
        if(!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")){
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

    public static double[] averageAgePerGender(List<Person> persons){
        int sumMale=0, contMale=0, sumFem=0, contFem=0;
        double averageAgeMale=0, averageAgeFem=0;
        double[] res = new double[2];

        for(Person persona : persons){
            if(persona.gender.equalsIgnoreCase("male")){
                sumMale+= persona.age;
                contMale++;
            }else if(persona.gender.equalsIgnoreCase("female")){
                sumFem+= persona.age;
                contFem++;
            }
        }
        averageAgeMale=sumMale/contMale;
        averageAgeFem=sumFem/contFem;
        
        res[0] = averageAgeMale;
        res[1] = averageAgeFem;
            
        return res;
    }
}
