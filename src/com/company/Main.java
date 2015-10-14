package com.company;

public class Main {

    public static void main(String[] args) {

        args[0] = "A A T G C C T A T G G C";
        String data = "ATCG TAGC ";
        for (char c : args[0].toCharArray())
            System.out.print(data.charAt(data.indexOf(c) + 5));
    }
}
