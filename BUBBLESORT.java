package com.DSA;

public class BUBBLESORT {

	public static void main(String[] args) {
     int[]arr= {50,30,44,2,7,39,99};
     int temp;
     System.out.println("Before sorted array:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
     for(int i=0;i<arr.length-1;i++) {
    	  for(int j=0;j<arr.length-1-i;j++) {
    		  if(arr[j]>arr[j+1]) {
    			  temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
    		  }
    		  }
    	  }
     
 	System.out.println();
	System.out.println("sorted array:");
	for (int a : arr) {
		System.out.print(a + " ");
		
	}
	}

}
