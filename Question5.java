package in.tasks;

public class Question5 {
	
	public static int[] mergeArrays(int[] nums1,int nums2[],int m, int n) {
		int temp[]=new int[m];
		for(int i=0;i<m;i++) {
			temp[i]=nums1[i];
		}
		int p1=0,p2=0;
		for(int i=0;i<m+n;i++) {
			if(p1<m && p2<n && temp[p1]<nums2[p2]  ) {
				nums1[i]=temp[p1];
				p1++;
			}else {
				nums1[i]=nums2[p2];
				p2++;
			}
				
		
		}
		return nums1;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {1,5,6};
		int m = 3,n = 3;

		int[] res = mergeArrays(nums1,nums2,m,n);
		for(int num:res)
			System.out.print(num+" ");

	}

}
