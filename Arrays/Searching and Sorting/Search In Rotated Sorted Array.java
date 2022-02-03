public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        
        return -1;
    }
}
