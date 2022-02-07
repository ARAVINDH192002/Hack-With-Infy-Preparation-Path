import java.util.*;
public class Solution {

	public static int paintTheFence(ArrayList<ArrayList<Integer>> ranges, int n, int q) {
		
	    ArrayList < Integer > [] section = new ArrayList [n+1];
	    for(int i=0;i<=n;i++){
            section[i] = new ArrayList < Integer >();
        }
        
        int [][] count = new int [q][q]; 
	    boolean [] isPainted = new boolean [n+1];
	
	    for (int i = 0; i < q; i++)
	    {
	        int l = ranges.get(i).get(0);
	        int r = ranges.get(i).get(1);

	        for (int j = l; j <= r; j++)
	        {
	            if (section[j].size() < 3)
	            {
	                section[j].add(i);
	            }

	            isPainted[j] = true;
	        }
	    }


	    int totalPainted = 0;

	    for (int i = 1; i <= n; i++)
	    {
	        if (isPainted[i] == true)
	        {
	            totalPainted += 1;
	        }
	    }


	    for (int i = 1; i <= n; i++)
	    {
	        if (section[i].size() == 1)
	        {
	            for (int j = 0; j < q; j++)
	            {
	                if (j != section[i].get(0))
	                {
	                    count[section[i].get(0)][j]++;
	                    count[j][section[i].get(0)]++;
	                }
	            }
	        }
	        else if (section[i].size() == 2)
	        {
	            count[section[i].get(0)][section[i].get(1)]++;
	            count[section[i].get(1)][section[i].get(0)]++;
	        }
	    }


	    int minUnpainted = Integer.MAX_VALUE;

	    for (int i = 0; i < q; i++)
	    {
	        for (int j = i + 1; j < q; j++)
	        {
	            minUnpainted = Math.min(minUnpainted, count[i][j]);
	        }
	    }

	    return totalPainted - minUnpainted;
	}
}
