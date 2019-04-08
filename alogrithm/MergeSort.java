/**  
 * @Title: MergeSort.java  
 * @Package com.java.algorithm    
 * @author pangning  
 * @date 2019年4月8日  
 * @version V1.0  
 */
package com.java.algorithm;

/**
 * @ClassName: MergeSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author pangning@58.com
 * @date 2019年4月8日 下午3:18:38
 * 
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 4, 6, 7, 4, 3, 8, 9, 1 };
		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ,");
		}
	}

	private static void mergeSort(int[] a, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort(a, lo, mid);
			mergeSort(a, mid + 1, hi);
			merge(a, lo, mid, hi);
		}

	}

	private static void merge(int[] a, int lo, int mid, int hi) {
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		int i = lo, j = mid + 1, t = 0;
		while (i <= mid && j <= hi) {
			if (a[i] <= a[j]) {
				temp[t++] = a[i++];
			} else {
				temp[t++] = a[j++];
			}
		}
		while (i <= mid) {
			temp[t++] = a[i++];
		}
		while (j <= hi) {
			temp[t++] = a[j++];
		}
		t = 0;
		for (int k = lo; k <= hi; k++) {
			a[k] = temp[t++];
		}
	}
}