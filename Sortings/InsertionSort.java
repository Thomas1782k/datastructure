package com.ds.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	private static int[] insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int t=a[i];
			int j=i-1;
			while(j>-1 && t<a[j]) {
				a[j+1]=a[j];
				a[j]=t;
				j--;
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
		
		System.out.print(Arrays.toString(insertionSort(a)));
	}

}
