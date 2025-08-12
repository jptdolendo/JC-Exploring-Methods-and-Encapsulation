package org.example;

public class ParameterPassing {
    /*
    * Expected output:
    * Before method call: 50
    * Inside method: 100
    * After method call: 50
    * */

    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }

    public static void main(String[] args) {
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
    }
}