package com.max.idea;

import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();
        if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        } else {
                System.out.println("Выберите единицу измерения: 5 - кг, 6 - грамм, 7 - тонна, 8 - унция");
            }
        var dis = scanner.nextInt();
        System.out.println("Введите число:");

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (dis == 1) {
            System.out.println("Метры: " + num);
            System.out.println("Мили: " + num * 0.00062);
            System.out.println("Ярды: " + num * 1.09);
            System.out.println("Футы: " + num * 3.28);
        } else if (dis == 2) {
            System.out.println("Мили: " + num);
            System.out.println("Метры: " + num * 1609.34);
            System.out.println("Ярды: " + num * 1760);
            System.out.println("Футы: " + num * 5280);
        } else if (dis == 3) {
            System.out.println("Ярды: " + num);
            System.out.println("Метры: " + num * 0.91);
            System.out.println("Мили: " + num * 0.00057);
            System.out.println("Футы: " + num * 3);
        } else if (dis == 4) {
            System.out.println("Футы: " + num);
            System.out.println("Метры: " + num * 0.3);
            System.out.println("Мили: " + num * 0.00019);
            System.out.println("Ярды: " + num * 0.33);
        } else if (dis == 5) {
            System.out.println("Килограммы: " + num);
            System.out.println("Граммы: " + num * 1000);
            System.out.println("Тонны: " + num * 0.001);
            System.out.println("Унции: " + num * 35.27);
        } else if (dis == 6) {
            System.out.println("Граммы: " + num);
            System.out.println("Килограммы: " + num * 0.001);
            System.out.println("Тонны: " + num * 0.000001);
            System.out.println("Унции: " + num * 0.035);
        } else if (dis == 7) {
            System.out.println("Тонны: " + num);
            System.out.println("Килограммы: " + num * 1000);
            System.out.println("Граммы: " + num * 1000000);
            System.out.println("Унции: " + num * 35273.96);
        } else if (dis == 8) {
            System.out.println("Унции: " + num);
            System.out.println("Килограммы: " + num * 0.028);
            System.out.println("Граммы: " + num * 28.35);
            System.out.println("Тонны: " + num * 0.000028);
        }
        }

    }

