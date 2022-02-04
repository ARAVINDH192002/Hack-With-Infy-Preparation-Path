public class Solution {

    private final static int mod = 1000000000 + 7;

    public static int[] getProductArrayExceptSelf(int[] arr) {
        int n = arr.length;
        
        int[] output = new int[n];
        int product = 1;

        for (int i = 0; i < n; ++i) {
            output[i] = product;
            product = ((product % mod) * (arr[i] % mod)) % mod;
        }

        product = 1;

        for (int i = n - 1; i >= 0; --i) {
            output[i] = ((output[i] % mod) * (product % mod)) % mod;
            product = ((product % mod) * (arr[i] % mod)) % mod;
        }

        return output;
    }
}
