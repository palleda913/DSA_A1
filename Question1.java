package in.tasks;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	
	public static int[] findSumOfTarget(int nums[],int target) {		
		 Map<Integer, Integer> map = new HashMap<>();
		 
		for(int i=0;i<nums.length;i++) {
			int second=target-nums[i];
			
			if(map.containsKey(second)) {
				
				//if want to get multiple solutions with same target
				//System.out.println("[" + map.get(second) + ", " + i + "]");
				
				return new int[] {map.get(second),i};
			}
			
			map.put(nums[i], i);
		}
		return new int[0];
	}
	public static void main(String[] args) {
		
		int[] nums = {2,4,7,11,15,18,19,26};
		int target =22;
		int[] res = findSumOfTarget( nums,target);
		
		System.out.println("[" + res[0] + ", " + res[1] + "]");
	
		

	}

}
