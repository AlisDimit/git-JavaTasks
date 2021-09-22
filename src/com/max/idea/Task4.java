package com.max.idea;

import java.util.Scanner;


public class Task4 {
    public static strictfp void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
//        double [] nums = {x, y, z};
//        double result = 0;
//        for (double m : nums) {
//            result += m;
        double m = (x + y + z) / 3;
        System.out.println(m);

        double k = m / 2;
        double result = Math.floor(k);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}

//    public class Task5 {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            double x = scanner.nextDouble();
//            double y = scanner.nextDouble();
//            int m = scanner.nextInt();
//            System.out.println(x m y);
//        }
//    }
//
//
//}