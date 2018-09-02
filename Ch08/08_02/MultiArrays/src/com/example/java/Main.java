package com.example.java;

public class Main {

    public static void main(String[] args) {

        String[][] states = new String[3][2];
        states[0][0] = "California";
        states[0][1] = "Sacramento";

        states[1][0] = "Oregon";
        states[1][1] = "Salem";

        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capitol of ")
                .append(state[i][0])
                .append(" is ")
                .append(states[i][0])
                .append(".");
            System.out.println(sb);
        }
    }
}
