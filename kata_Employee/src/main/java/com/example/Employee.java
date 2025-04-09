package com.example;

public class Employee {
    public String name;
    public int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String toString(){
        return name + " " + age;
    }

    public boolean isMajeur(){
        return age >= 18 ;
    }
}
