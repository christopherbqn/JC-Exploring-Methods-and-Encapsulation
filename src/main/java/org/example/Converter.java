package org.example;

public class Converter {

    public static void celsiusToFahrenheit(double celsius){
        float result = (float) ((celsius * 9.0f / 5.0f) + 32);
        System.out.println(celsius + " degrees C is " + result +" degrees F.");
    }

    public static void fahrenheitToCelsius(double fahrenheit){
        float result = (float) ((fahrenheit -32)* 5.0f / 9.0f);
        System.out.println(fahrenheit + " degrees F is " + result +" degrees C.");
    }
}
