package com.max.idea;

import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        char m = (char) System.in.read();

        if (m == '+') {
            System.out.println(x + y);
        } else if (m == '-') {
            System.out.println(x - y);
        } else if (m == '*') {
            System.out.println(x * y);
        } else if (m == '/') {
            System.out.println(x / y);


        }
    }
}


