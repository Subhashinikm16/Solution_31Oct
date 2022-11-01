package Oct31Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums= {-1,2,-1,0,1,4};
        int left=0;
        int right=nums.length-1;
        LinkedHashMap<ArrayList<Integer>,Integer> map=new LinkedHashMap<>();
        while(left<=right) {
        	for(int i=right;i>=left;i--) {
        		int sum=0;
        		ArrayList<Integer> list=new ArrayList<>(3);
        		for(int j=left;j<=i;j++) {
        			sum+=nums[j];
                    list.add(nums[j]);
        		}
        		if(sum==0 && list.size()==3) {
        			map.put(list, list.size());
        		}
        	}
        	left++;
        }
        System.out.println(map);
        for(Entry<ArrayList<Integer>, Integer> m:map.entrySet()) {
        	System.out.print(m.getKey());
        }
	}
}

