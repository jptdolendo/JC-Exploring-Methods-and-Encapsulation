package org.example;

public class Bank {
    /*
    * Expected output:
    * Alice has a balance of $1200.50
    * */
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        // The following line would cause a compile-time error if uncommented
        // System.out.println(myAccount.balance);
    }
}