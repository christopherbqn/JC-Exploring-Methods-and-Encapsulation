package org.example;

public class Car {

    // Designing methods
    public void startEngine(){
        System.out.println("Engine has started.");
    }

    public String drive(int speed){
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine(){
        System.out.println("Engine has been turned off.");
    }

    // Passing Parameters
    public static void modifyValue(int value){
        value = 100;
        System.out.println("Inside method: " + value);
    }



}
