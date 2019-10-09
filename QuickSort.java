//QuickSort algorithm

import java.util.Arrays;

public class QuickSort {
	
	private static int partition(int[] arr,int lo,int hi) {
		int i = lo - 1, pivot = hi;
		for(int j=lo;j<hi;j++) {
			if(arr[j] <= arr[pivot]) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,pivot);
		return i + 1;
	}
	
	private static void quickSort(int[] arr,int lo, int hi) {
		if (lo < hi) {
			int pivot = partition(arr,lo,hi);
			quickSort(arr,lo,pivot-1);
			quickSort(arr,pivot+1,hi);
		}
		
	}
	
	private static void swap(int[] arr,int i,int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,4,3,2,1};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
