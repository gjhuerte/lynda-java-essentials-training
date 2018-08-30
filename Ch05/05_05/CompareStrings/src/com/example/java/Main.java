package com.example.java;

public class Main {

    public static void main(String[] args) {
	    String str1 = "Hello";
        String str2 = "Hello";
        System.out.print("Hello and Hello: ");
        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        System.out.print("hello and Hello: ");
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        System.out.print("'Hello World' and 'Hello World': ");
        if (str4 == str5) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        System.out.print("'Hello World' and 'Hello World': ");
        if (str4.equals(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        str5 = "hello World";
        System.out.print("'hello World' and 'Hello World': ");
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }
}
