package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = 0.012;
        double pSum = value + value + value;

        System.out.println("Sum of primitives: " + pSum);
        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of Big-Decimals: " + bSum.toString( ));
    }
}
