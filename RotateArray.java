/**
**Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
**@Author: Venkata Nagendra Kumar Pasupula
**/

public class RotateArray{
	public void rotate(int[] nums, int k) {
	k = (k%nums.length);
	int end = nums.length-1-k;
    nums = reverseArray(nums,0,end);
	nums = reverseArray(nums,end+1,nums.length-1);
	nums = reverseArray(nums,0,nums.length-1);
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}
	public int[] reverseArray(int[] nums,int start,int end){
		while(start < end){
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start++;
			end--;
		}
		return nums;
	}
	public static void main(String[] args){
	RotateArray ra = new RotateArray();
//	int[] nums={1,2,3,4,5,6,7};
	int[] nums ={-1};
	ra.rotate(nums,2);
	
	}
}