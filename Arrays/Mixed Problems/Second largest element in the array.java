import java.util.*;
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
        Arrays.sort(arr);
		for (int i = n-1; i > 0; i--) {
			if (arr[i] != arr[i - 1]) {
				return arr[i-1];
			}
		}
		return -1;
	}
}
