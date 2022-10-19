package com.ds.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(Arrays.toString(mergeSort(arr)));

	}

	private static int[] mergeSort(int[] arr) {
		
		if(arr.length==1)return arr;
		
		int mid=arr.length/2;
		int[] left=Arrays.copyOfRange(arr, 0, mid);
		int[] right=Arrays.copyOfRange(arr, mid, arr.length);
		
		return merge(mergeSort(left),mergeSort(right));
	}

	private static int[] merge(int[] l, int[] r) {
		
		int[] op=new int[r.length+l.length];
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			
			if(l[i]<r[j]) {
				op[k++]=l[i++];
			}else {
				op[k++]=r[j++];
			}

		}
		while(i<l.length) {
			op[k++]=l[i++];
		}
		while(j<r.length) {
			op[k++]=r[j++];
		}
		return op;
	}

}
