import java.util.*;

public class Solution {

    public static int subArrayCount(ArrayList < Integer > arr, int k) {

    	 // Write your code here.
        HashMap < Integer, Integer > temp= new HashMap < > (); 
    temp.put(0, 1); 

    int count = 0;
    long summ = 0;
    for (int i = 0; i < arr.size(); i++) {
      summ += arr.get(i);
      int rem = (int)(((summ % k) + k) % k);

      if (temp.containsKey(rem)) {
        count += temp.get(rem);
        temp.put(rem, temp.get(rem) + 1);
      } else {
        temp.put(rem, 1);
      }
    }
    return count;       
    }
}
