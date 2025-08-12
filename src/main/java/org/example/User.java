package org.example;

public class User {
    private String password;

    public User() {
        this.setPassword("12345678");
    }

    public String getPassword() {
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }
}
