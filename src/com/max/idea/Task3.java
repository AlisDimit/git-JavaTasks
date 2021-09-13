package com.max.idea;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {22, 3, 5, 8, 9};
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = temp;

        System.out.println(arr[0] + arr[arr.length / 2]);
    }
}
