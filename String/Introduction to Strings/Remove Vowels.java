import java.util.*;
public class Solution {
	public static String removeVowels(String str) {
	 // Write your code here.
        StringBuilder result = new StringBuilder();
		for(int i = 0; i < str.length();i++){
			char current = str.charAt(i);
			if(current != 'a' && current !='e' && current !='i' && current!='o' && current !='u' && current != 'A' && current !='E' && current !='I' && current!='O' && current !='U'){
				result.append(current);
			}
		}
		return result.toString();
	}
}
