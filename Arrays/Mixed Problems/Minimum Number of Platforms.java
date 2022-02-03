import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
       int plat[] = new int[2361];
		Arrays.fill(plat, 0);
		int Platforms = 1;

		for (int i = 0; i < n; i++) {
			++plat[at[i]];
			--plat[dt[i] + 1];
		}
		for (int i = 1; i < 2361; i++) {
			plat[i] = plat[i] + plat[i - 1];
			Platforms = Math.max(Platforms, plat[i]);
		}
		return Platforms;
    }
}
