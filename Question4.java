package in.tasks;

import java.util.Arrays;

public class Question4 {

	 public static int[] plusOne(int[] digits) {
	        int n = digits.length;

	        // Iterate through the digits in reverse order
	        for (int i = n - 1; i >= 0; i--) {
	            if (digits[i] < 9) {
	                digits[i]++; 
	                return digits; 
	            }

	            digits[i] = 0; // Set the current digit to 0 if it is 9
	        }

	        // If all digits were 9, create a new array with an additional leading 1
	        int[] newDigits = new int[n + 1];
	        newDigits[0] = 1;

	        return newDigits; 
	    }

	    public static void main(String[] args) {
	        int[] digits = {1, 2,19};


	        int[] result = plusOne(digits);
	        System.out.println("Output: " + Arrays.toString(result)); 
	    }

}
