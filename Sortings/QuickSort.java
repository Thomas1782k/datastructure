package com.ds.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(Arrays.toString(QuickSort(arr,0,n-1)));

	}

	private static int[] QuickSort(int[] arr, int left, int end) {
		if(left<end) {
		int pivotIndex=pivot(arr,left,end);
		QuickSort(arr, left, pivotIndex-1);
		QuickSort(arr, pivotIndex+1, end);
		}
		return arr;
	}

	private static int pivot(int[] arr, int pivotIndex, int end) {

		int swapIndex=pivotIndex;
		for(int i=pivotIndex+1;i<=end;i++) {
			if(arr[pivotIndex]>arr[i]) {
				swapIndex++;
				swap(arr,swapIndex,i);
			}
		}
		swap(arr,pivotIndex,swapIndex);
		return swapIndex;
	}

	private static void swap(int[] arr, int first, int second) {
		int t=arr[first];
		arr[first]=arr[second];
		arr[second]=t;
	}

}
