package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        // For a set number of times the code will execute
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
