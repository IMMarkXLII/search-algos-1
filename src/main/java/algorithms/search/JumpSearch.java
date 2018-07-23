/**
 * @author ashish.adhikari
 */
package algorithms.search;

/**
 * @author ashish.adhikari
 *
 */
public class JumpSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};
		int pos = jumpSearch(arr, 11);
		System.out.println(pos + "=>" + (pos!=-1 ? (arr[pos]+"") : "not found"));
	}
	static int jumpSearch(int arr[], int item) {
		if(arr.length < 1 || arr[0] > item || arr[arr.length-1] < item)
			return -1;
		int pos = -1;
		
		int jumpStep = (int) Math.floor(Math.sqrt(arr.length));
		int last = jumpStep;
		int prevJumpIndex = 0;
		while(arr[Math.min(last, arr.length)] < item) {
			prevJumpIndex = last;
			last+=last;
			if(prevJumpIndex >= arr.length)
				return -1;
			if(last > arr.length) {
				last = arr.length-1;
				break;
			}
		}
		for(int i=prevJumpIndex; i<= last;i++) {
			if(arr[i]==item)
			{
				pos = i; 
				break;
			}
		}
		return pos;
	}
}
