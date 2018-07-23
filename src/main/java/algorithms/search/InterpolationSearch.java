/**
 * @author ashish.adhikari
 */
package algorithms.search;

/**
 * @author ashish.adhikari
 *
 */
public class InterpolationSearch {
	public static void main(String[] args) {
		int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};
		int pos = interpolationSearch(arr, 42);
		System.out.println(pos + "=>" + (pos!=-1 ? (arr[pos]+"") : "not found"));
	}
	static int interpolationSearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high && item >= arr[low] && item <= arr[high]) {
			/*System.out.println("--------------");
			System.out.println(high);
			System.out.println(low);*/
			int pivot = low==high ? low : low + (((high-low)/(arr[high]-arr[low])) * (item - arr[low]));
			
			if(arr[pivot] == item )
				return pivot;
			if(arr[pivot] < item)
				low = pivot + 1;
			else
				high = pivot - 1;
			
		}
		return -1;
	}
}
