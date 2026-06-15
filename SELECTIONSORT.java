package com.DSA;

public class SELECTIONSORT {

    public static void main(String[] args) {

        int[] arr = {45, 7, 9, 0, 18, 50, 98};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Ascending order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}