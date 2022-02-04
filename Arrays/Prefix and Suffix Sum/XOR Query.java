import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {

		// Create an empty array ans
		ArrayList<Integer> ans = new ArrayList<Integer>();

		int flag = 0;
		for (int i = 0; i < queries.size(); i++) {
			if (queries.get(i).get(0) == 1) {
				ans.add(queries.get(i).get(1) ^ flag);
			} else {
				flag ^= queries.get(i).get(1);
			}

		}

		for (int i = 0; i < ans.size(); i++) {
			ans.set(i, ans.get(i) ^ flag) ;
		}

		return ans;

	}
}
