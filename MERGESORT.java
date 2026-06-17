package com.DSA;

import java.util.Arrays;

public class MERGESORT {

    static void divide(int[] arr) {

        if(arr.length <= 1) {
            return;
        }

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - left.length];

        for(int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for(int j = 0; j < right.length; j++) {
            right[j] = arr[left.length + j];
        }

        divide(left);
        divide(right);

        merge(left, right, arr);
    }

    static void merge(int[] left, int[] right, int[] arr) {

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length) {

            if(left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i < left.length) {
            arr[k++] = left[i++];
        }

        while(j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {50, 30, 44, 2, 7, 39, 99};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        divide(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}