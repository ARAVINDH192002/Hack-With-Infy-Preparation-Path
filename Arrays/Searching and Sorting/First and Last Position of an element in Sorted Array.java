import java.util.ArrayList;

public class Solution {
	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		// Write your code here.
        int index1 = -1, index2 = -1;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) == x) {
				if (index1 == -1 && index2 == -1) {
					index1 = i;
					index2 = i;
				}
				else {
					index2 = i;
				}
			}
		}

		Pair sol = new Pair();
		sol.first = index1;
		sol.second = index2;
		return sol;
	}
}
