package com.max.idea;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {22, 3, 5, 8, 9};
        int temp = arr[4];
        arr[4] = arr[0];
        arr[0] = temp;

        System.out.println(arr[arr.length - 5] + arr[arr.length - 3]);
    }
}
