package com.DSA;

public class INSERTIONSORT {

	public static void main(String[] args) {

		int[] arr = {50, 30, 44, 2, 7, 39, 99};

		System.out.println("Before sorted array:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;
		}

		System.out.println();
		System.out.println("Sorted array:");

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}