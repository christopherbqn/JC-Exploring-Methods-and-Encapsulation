package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Designing methods
        Car myCar = new Car();
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

        // static methods and variables
        System.out.println("\n--- 5️⃣ Static methods and Variables ---");
        System.out.println("App Name: " + Main.getAppName());
        Main mainStatic = new Main();
        System.out.println("Instance ID: " + mainStatic.getInstanceId());

        // mini challenge
        System.out.println("\n---mini challenge---");
        Converter.celsiusToFahrenheit(25);


        // Method Overloading
        System.out.println("\n--- 6️⃣ Method Overloading ---");
        Main mainDisplay = new Main();
        mainDisplay.show(42);
        mainDisplay.show("Hello");
        mainDisplay.show("Goodbye", 3);

        //mini challenge
        System.out.println("\n---mini challenge---");
        Converter.celsiusToFahrenheit(25);
        Converter.fahrenheitToCelsius(77);


        // Constructor and Constructor overlaoding
        System.out.println("\n--- 7️⃣ Constructors and Constructor Overloading ---");
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();

        // mini challenge
        System.out.println("\n---mini challenge---");
        Computer computer1 = new Computer();
        System.out.println("Computer 1:" + computer1.display());

        Computer computer2 = new Computer("Dell");
        System.out.println("Computer 2:" + computer2.display());

        Computer computer3 = new Computer("Apple", 16);
        System.out.println("Computer 3:" + computer3.display());


        // Encapsulation
        System.out.println("\n--- 8️⃣ Encapsulation ---");
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0);
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0);
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());



        //mini challenge
        System.out.println("\n---mini challenge---");

        System.out.println("Attempting to set short password 'pass'");
        User myUser = new User("pass");
        System.out.println("Current Masked Password: " + myUser.getPassword());

        System.out.println("\nAttempting to set valid password 'secure_password_123'");
        myUser.setPassword("secure_password_123");
        System.out.println("Current Masked Password: "+ myUser.getPassword());



    }


    // Encapsulation

    public static class Thermostat{

        private double temperatureCelsius;

        public Thermostat(double temp){
            setTemperatureCelsius(temp);
        }

        public double getTemperatureCelsius() {
            return this.temperatureCelsius;
        }

        public void setTemperatureCelsius(double temp){
            if (temp >= 10.0 && temp <= 30.0){
                this.temperatureCelsius = temp;
            }else{
                System.out.println("Error: Temperature must be between 10.0 and 30.0 Celsius.");
            }
        }
    }




    // Constructors and Constructor overloading
    public static class Pizza{
        private String toppings;
        private int size;

        public Pizza(){
            this.toppings = "Cheese";
            this.size = 12;
            System.out.println("Default pizza created.");
        }

        public Pizza(String toppings){
            this();
            this.toppings =toppings;
            System.out.println("Pizza with custom toppings created.");
        }

        public Pizza(String toppings, int size){
            this.toppings = toppings;
            this.size = size;
            System.out.println("Fully custom pizza created.");
        }

        public void display(){
            System.out.println("Size " + size + " inches, Toppings: " + toppings);
        }
    }



    // method overloading
    public void show(String message){
        System.out.println("Message: " + message);
    }

    public void show(String message, int times){
        System.out.println("Repeating message: ");
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
    }

    public void show(int number){
        System.out.println("Number: " + number);
    }

    // static methods and variables
    public static String getAppName(){
        return "My Awesome App";
    }

    public String getInstanceId(){
        return "ID-12345";
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

