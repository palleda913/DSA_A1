package in.tasks;

import java.util.Arrays;

public class Question8 {

	    public static int[] findErrorInNumbers(int[] nums) {
	        int n = nums.length;
	        int[] count = new int[n + 1];
	        int[] result = new int[2];
	        // Count the occurrences of numbers
	        for (int num : nums) {
	            count[num]++;
	           
	        }

	        
	        for (int i = 1; i <= n; i++) {
	            if (count[i] == 2) {
	                result[0] = i;
	            } else if (count[i] == 0) {
	                result[1] = i; 
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 4};

	       
	        int[] result =findErrorInNumbers(nums);
	        System.out.println("Output: " + Arrays.toString(result)); 
	    }
}
