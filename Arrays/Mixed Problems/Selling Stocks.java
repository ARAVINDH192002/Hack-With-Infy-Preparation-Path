public class Solution {
    public static long getMaximumProfit (int n, long[] values) {
        // Your code goes here.
        if(n <= 1) {
            return 0;
        }

        long profit = 0L;
        int buyingDay = 0, sellingDay = 1;
        int totalDays = n;

        while(sellingDay < totalDays){

            if(values[sellingDay] > values[buyingDay]) {
                profit += (values[sellingDay] - values[buyingDay]);
            }
            buyingDay++;
            sellingDay++;
        }

        return profit;
    }
}
