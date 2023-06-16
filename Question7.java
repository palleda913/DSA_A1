package in.tasks;

import java.util.Arrays;

public class Question7 {

	public static int[] moveZeroAtEnd (int arr[]) {
		int start=0;
		
		for(int num:arr) {
			if(num!=0)
				arr[start++]=num;
		}
		while(start<arr.length)
			arr[start++]=0;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,0,2,0,3,0,3,4};
		moveZeroAtEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

}
