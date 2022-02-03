import java.util.*;
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        Arrays.sort(arr);
        int mx = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && (arr[i] == arr[i - 1] + 1)) {
                count++;
            }
            else if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            else {
                count = 1;
            }
            mx = Math.max(mx, count); 
        }
        return mx;
    }
}
