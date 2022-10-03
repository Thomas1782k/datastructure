package com.ds.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	
	public static int[] bubbleSort(int[] a) {
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				}
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
		
		System.out.print(Arrays.toString(bubbleSort(a)));

	}

}
