/**
** Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
**@Author: Venkata Nagendra Kumar Pasupula
**/

public class MoveZeros{
	public void move(int[] nums) {
      int counter = 0;
	  for(int i=0;i<nums.length;i++){
		if(nums[i] !=0) nums[counter++] = nums[i];
	  }
		for(int j=counter;j<nums.length;j++){
			nums[j]=0;
		}
		for(int k=0;k<nums.length;k++){
			System.out.print(nums[k]+"\t");
		}
    }
	public static void main(String[] args){
		MoveZeros mz =new MoveZeros();
		int[] nums = {0,1,3,9,0,0,2,10,8,0}; 
		mz.move(nums);
		
	}
}