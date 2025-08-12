package org.example;

public class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        double result = (celsius * 9.0/5.0) + 32;
        System.out.println(celsius + " degrees C is " + result + " degrees F.");
        return result;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * 5.0/9.0;
        System.out.println(fahrenheit + " degrees F is " + result + " degrees C.");
        return result;
    }
}
