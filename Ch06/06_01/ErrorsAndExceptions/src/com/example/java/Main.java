package com.example.java;

public class Main {

    public static void main(String[] args) {

//        Syntax Error
//        String s = Null;
        String s = null;

        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
//        Runtime Error
//        char lastChar = chars[chars.length];
        char lastChar = chars[chars.length - 1 ];
        System.out.println(lastChar);

    }
}
