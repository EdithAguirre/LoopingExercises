package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {

        // counter variable
        int count = 0;

        // Executes the code block once and continues if condition is true
        do{
            System.out.println("I love Java");
            count++;
        }while(count < 5);
    }
}
