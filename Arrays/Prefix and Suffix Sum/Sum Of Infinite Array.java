import java.util.*;
public class Solution {

    private static int mod = (int) 1e9 + 7;

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> ans = new ArrayList<>();
        long sumArray[] = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArray[i] = (sumArray[i - 1] + arr[i - 1]) % mod;
        }
        for (List<Long> range : queries) {

            long l = range.get(0);
            long r = range.get(1);
            long rsum = func(sumArray, r, n);
            long lsum = func(sumArray, l - 1, n);
            ans.add((int) ((rsum - lsum + mod) % mod));

        }
        return ans;
    }
    private static long func(long sumArray[], long x, long n) {
        long count = (x / n) % mod;

        long res = (count * sumArray[(int) n]) % mod;
        res = (res + sumArray[(int) (x % n)]) % mod;

        return res;
    }
}
