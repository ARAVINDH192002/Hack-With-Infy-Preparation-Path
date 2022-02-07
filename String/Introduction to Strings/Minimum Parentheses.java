public class Solution {
	public static int minimumParentheses(String pattern) {
        int open = 0;
		int close = 0;
		int count = 0;

		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == '(') {
				open += 1;
			} else {
				close += 1;
			}
			if (close > open) {
				count += (close - open);
				open = 0;
				close = 0;
			}
		}

		count += (open - close);

		return count;
	}
}
