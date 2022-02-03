import java.util.*;
public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		// Write your code here.
        
        Collections.sort(arr);
        
        for(int i=0;i<arr.size()-2;i++){
			if(arr.get(i)+arr.get(i+1)>arr.get(i+2)){
                return true;
            }
        }
        return false;
	}
}
