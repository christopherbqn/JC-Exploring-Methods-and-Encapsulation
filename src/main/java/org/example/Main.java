package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        // Designing methods
        System.out.println("--- 1️⃣ Designing Methods ---");
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine();

        // Passing Parameters
        System.out.println("\n--- 2️⃣ Passing Parameters: Primitives vs. Objects ---");
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        Car.modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);

        //mini challenge
        System.out.println("\n---mini challenge---");
       Student newStudent = new Student("Alex");
       System.out.println("Name before change: " + newStudent.name);
       changeStudentName(newStudent, "Jordan");
       System.out.println("Name after change: " + newStudent.name);

       //using varargs
        System.out.println("\n--- 3️⃣ Using Varargs ---");
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();

        System.out.println("--mini challenge---");
        findLargest(10,5,25,15);
        findLargest(-5,-10,-1);
        findLargest();

        // access specifiers
        Account myAccount = new Account();
        System.out.println("\n--- 4️⃣ Access Specifier ---");
        myAccount.displayAccountDetails();

       //  System.out.println(myAccount.balance);

        // mini challenge
        System.out.println("\n---mini challenge---");
        SmartDoor mySmartDoor = new SmartDoor();
        System.out.println("Is the door locked? " + mySmartDoor.isLocked() );
        mySmartDoor.lockDoor();
        System.out.println("Is the door locked? " + mySmartDoor.isLocked());
        mySmartDoor.unlockDoor();
        System.out.println("Is the door locked " + mySmartDoor.isLocked());

    }







    // passing parameters mini challenge
    public static void changeStudentName(Student student, String newName){
        student.name = newName;
    }

    // using varargs
    public static void printMessages(String... messages){
        System.out.println("Number of messages: " + messages.length);
        for(String msg:messages){
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    // varargs mini challenge
    public static void findLargest(int...numbers){
        int largestNum = Integer.MIN_VALUE;

        if(numbers.length>0){

            for(int i = 0; i<numbers.length; i++){
                if(numbers[i] > largestNum) {
                    largestNum = numbers[i];
                }
            }
        }
        System.out.println("Largest in " + Arrays.toString(numbers) + " is: " + largestNum );
    }







}