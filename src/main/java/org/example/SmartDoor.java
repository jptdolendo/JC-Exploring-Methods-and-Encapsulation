package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void isLocked() {
        System.out.println("Is the door locked? " + isLocked);
    }

    public void lockDoor() {
        System.out.println("Locking the door...");
        this.isLocked = true;
        isLocked();
    }

    public void unlockDoor() {
        System.out.println("Unlocking the door...");
        this.isLocked = false;
        isLocked();
    }
}
