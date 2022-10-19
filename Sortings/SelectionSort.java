package com.ds.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	private static int[] selectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int minInd=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minInd])
					minInd=j;
			}
			if(i!=minInd) {
				int t=a[i];
				a[i]=a[minInd];
				a[minInd]=t;
			}
		}
		return a;
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print(Arrays.toString(selectionSort(a)));

	}

}
