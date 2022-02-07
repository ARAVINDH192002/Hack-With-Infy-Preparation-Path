public class Solution{
	public static String convertString(String str) {
            // Write your code here
        String a[]=str.split(" ");
        StringBuffer b=new StringBuffer();
        for(int i=0;i<a.length;i++){
            b.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
        }
        return b.toString().trim();
        }

}
