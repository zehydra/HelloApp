package org.example;

public class HelloApp5 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Build string with delimiter after every name
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", " using substring
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
