public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        int max=0;
        int currentmax=0;
        int one=0;
        
        for(int i=0;i<n;i++){
			int num=arr[i];
        	int value;
        
        	if(num==1){
                one++;
                value=-1;
            }else value=1;
           		currentmax=Math.max(value,currentmax+value);
        		max=Math.max(max,currentmax);
        }
        return(one+max);
	}
}
