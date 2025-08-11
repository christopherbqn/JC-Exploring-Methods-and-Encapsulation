package org.example;

public class Computer {
    private String brand;
    private int ramInGB;

    public Computer() {
        this.brand = "Generic";
        this.ramInGB = 8;
    }

    public Computer(String brand){
        this();
        this.brand = brand;
    }

    public Computer(String brand, int ramInGB){
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public String display(){
        return " Brand = " + brand + ", RAM = " + ramInGB + "GB";
    }

}
