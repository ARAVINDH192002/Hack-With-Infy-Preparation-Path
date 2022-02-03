public class Solution {

	public static boolean isPossible(int[] arr, int n) {
		int i, Index = -1;
		for (i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				if (Index != -1) {
					return false;
				}
				Index = i;
			}
		}
		if (Index == -1 || Index == 0 || Index == n - 2) {
			return true;
		}
		if (arr[Index - 1] <= arr[Index + 1]) {
			return true;
		}
		if (arr[Index] <= arr[Index + 2]) {
			return true;
		}
		return false;
	}
}
