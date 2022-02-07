public class Solution {
    public static String leftRotate(String str, int d) {
        // Write you code here.
         int n = str.length();
        if(n < d) {
            return leftRotate(str, d % n);
        }
        String ans = "";
        ans = ans + str.substring(d);
        ans = ans + str.substring(0, d);

        return ans;
    }

    public static String rightRotate(String str, int d) {
        // Write you code here.
         int n = str.length();
        if(n < d) {
            return rightRotate(str, d % n);
        }
        String ans = "";
        ans = ans + str.substring(n - d);
        ans = ans + str.substring(0, n - d);

        return ans;
    }
}
