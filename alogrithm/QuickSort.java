/**  
 * @Title: QuickSort.java  
 * @Package com.java.algorithm    
 * @author pangning  
 * @date 2019年4月8日  
 * @version V1.0  
 */
package com.java.algorithm;

/**
 * @ClassName: QuickSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author pangning@58.com
 * @date 2019年4月8日 下午2:37:39
 * 
 */
public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 4, 6, 7, 4, 3, 8, 9, 1 };
		quickSort(a, 0, 7);
		for (int i : a) {
			System.out.print(i + " ,");
		}
	}

	private static void quickSort(int[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = partition(a, lo, hi);
		quickSort(a, lo, mid - 1);
		quickSort(a, mid, hi);
	}

	private static int partition(int[] a, int lo, int hi) {
		int mid = (hi + lo) / 2;
		while (lo <= hi) {
			while (a[lo] < a[mid]) {
				lo++;
			}
			while (a[hi] > a[mid]) {
				hi--;
			}
			if (lo <= hi) {
				swap(a, lo++, hi--);
			}
		}
		return lo;
	}

	private static void swap(int[] a, int lo, int hi) {
		int temp = a[lo];
		a[lo] = a[hi];
		a[hi] = temp;
	}
}