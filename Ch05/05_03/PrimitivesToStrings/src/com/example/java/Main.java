package com.example.java;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean booleanValue = true;
        String fromBool = Boolean.toString(booleanValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        String formatted = numberFormat.format(longValue);
        System.out.println(formatted);

    }
}
