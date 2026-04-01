package org.example;

public class HelloApp4 {
    public static void main(String[] args) {

        StringBuilder namesBuilder = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            for (String name : args) {
                namesBuilder.append(name).append(", ");
            }

            // Remove trailing comma and space
            namesBuilder.setLength(namesBuilder.length() - 2);

            System.out.println("Hello, " + namesBuilder.toString() + "!");
        }
    }
}
