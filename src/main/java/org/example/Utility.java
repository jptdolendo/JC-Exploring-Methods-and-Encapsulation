package org.example;

public class Utility {
    /*
    * Expected output:
    * App Name: My Awesome App
    * Instance ID: ID-12345
    * */

    public static String getAppName() {
        return "My Awesome App";
    }

    public String getInstanceId() {
        return "ID-12345";
    }

    public static void main(String[] args) {
        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());
    }
}
