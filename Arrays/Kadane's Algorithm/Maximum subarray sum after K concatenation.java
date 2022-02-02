import java.util.*;
public class Solution {
	public static long Solution(ArrayList <Integer> arr, int n, int k){
	     long maxsum = Long.MIN_VALUE;
	     long sum = 0; 	  
	    for (int i = 0; i < n * k; i++){ 
	        sum += arr.get(i % n); 
	        maxsum = Math.max(maxsum, sum);	  
	        if (sum < 0){
	            sum = 0;
	        } 
	    } 
	    return maxsum;
	}

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		long maxSubSum;
	    if (k == 1){
	        maxSubSum = Solution(arr, n, k);
	        return maxSubSum;
	    }
	    int arrSum = 0;
	    for (int i = 0; i < n; i++){
	        arrSum += arr.get(i);
	    }
	    if (arrSum <= 0){   
	        maxSubSum = Solution(arr, n, 2);   
	    }
	    else{
	        maxSubSum = Solution(arr, n, 2);
	        maxSubSum += (long)(k - 2) * (long)arrSum;
	    } 
	    return maxSubSum;
	}
}
