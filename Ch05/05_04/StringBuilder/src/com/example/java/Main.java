package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ")
            .append("World")
            .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");

        /**
         * nexline method - waits for user to type in text
         * press enter or return
         * whatever the user types returns by the variable
         */
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb.toString());

    }
}
