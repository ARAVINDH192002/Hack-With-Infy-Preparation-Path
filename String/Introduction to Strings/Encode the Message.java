public class Solution {
	public static String encode(String message) {
		// Write your code here.
        int n = message.length();

        StringBuilder code = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char curChar = message.charAt(i);
            int charFreq = 1;
            while (i + 1 < n && message.charAt(i + 1) == curChar) {
                i++;
                charFreq++;
            }

            code.append(curChar);
            code.append("" + charFreq);
        }

        return code.toString();
	}
}
