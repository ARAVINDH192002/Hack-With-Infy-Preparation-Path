import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {
		if (k == 0) {
			return arr;
		}

		ArrayList<Integer> a = new ArrayList<>();
		int maxm = Collections.max(arr);
		int minm = Collections.min(arr);

		if ((k % 2 != 0)) {
			for (int i = 0; i < n; i++) {
				a.add(maxm - arr.get(i));
			}

			return a;
		}

		else {
			for (int i = 0; i < n; i++) {
				a.add(arr.get(i) - minm);
			}

			return a;
		}

	}
}
