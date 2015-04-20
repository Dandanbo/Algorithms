package com.ddb.algorithms;

public class SelectionSort extends BaseSort {
	public static void sort(Comparable[] a){
		int N=a.length;
		for (int i = 0; i < N; i++) {
			int min=i;
			for (int j = 0; j < N; j++) {
				if (less(a[j],a[i])) {
					min=j;
				}
			}
			exch(a,i,min);
		}
	}
}
