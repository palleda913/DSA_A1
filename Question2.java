package in.tasks;

public class Question2 {

	public static int removeOccurences(int[] nums,int val) {
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
			
		}
		return k;
	}
	public static void main(String[] args) {
		
		int []nums = {3,2,7,8,3,9,3,2,3};
		int val = 3;
		
		int res = removeOccurences(nums, val);
		System.out.println("The size of elements::"+res);
	}
}
