/**
 * @author ashish.adhikari
 */
package algorithms.search;

import java.util.Arrays;

/**
 * @author ashish.adhikari
 *
 */
public class ExponentialSearch {
	public static void main(String[] args) {
		int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};
		int pos = exponentialSearch(arr, 47);
		System.out.println(pos + "=>" + (pos>=0 ? (arr[pos]+"") : "not found"));
	}

	/**
	 * @param arr
	 * @param i
	 * @return
	 */
	private static int exponentialSearch(int[] arr, int i) {
		int start = 0;
		
		if(arr[start] == i)
			return start;
		start =1;
		while(start < arr.length && arr[start] <= i) {
			start*=2;
		}
		return Arrays.binarySearch(arr, start/2, Math.min(start, arr.length), i);
	}
}
