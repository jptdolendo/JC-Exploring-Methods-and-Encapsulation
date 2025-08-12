package org.example;

import java.util.Arrays;

public class VarargsExample {
    /*
    * Expected output:
    * Number of messages: 2
    * Hello World
    *
    * Number of messages: 3
    * Testing Varargs Here
    *
    * Number of messages: 0
    *
    * */

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static int findLargest(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Largest with no numbers is: " + Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }

        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Largest in (" + Arrays.toString(numbers) + ") is: " + max);

        return max;
    }

    public static void main(String[] args) {
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();

        findLargest(10, 5, 25, 15);
        findLargest(-5, -1, -10);
        findLargest();
    }
}
