package org.example;

public class HelloApp6 {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are passed
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with ", "
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}
