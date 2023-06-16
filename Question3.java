package in.tasks;



public class Question3 {

	public static int binarySearch(int a[],int start ,int end,int key)
	{
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(key<a[mid]) {
				end=mid-1;
				
			}else if(key>a[mid]) {
				start=mid+1;
				
			}else if(key==a[mid]){
				return mid;
			}	
		}
		return start;
		
	}
	public static void main(String[] args) {
		int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 
		target = 25;
		
		System.out.println("The output is "+binarySearch(arr,0,arr.length-1, target));

	}
}
