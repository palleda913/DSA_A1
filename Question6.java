package in.tasks;

import java.util.HashSet;
import java.util.Set;

public class Question6 {

	public static boolean checkDuplicate(int arr[]) {
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arr) {
			if(set.contains(num))
				return true;
			
			set.add(num);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,3,4};
		boolean res= checkDuplicate(nums);
		System.out.println(res);
	}

}
