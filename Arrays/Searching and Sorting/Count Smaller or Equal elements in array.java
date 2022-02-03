import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            int idx = upperBound(b, 0, m - 1, a[i]);
            arr.add(idx + 1);

        }
        return arr;
    }

    private static int upperBound(int arr[], int l, int r, int element) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= element) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return r;
    }
}
