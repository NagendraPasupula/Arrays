/**
**Given an array and a value, remove all instances of that value in place and return the new length.
**Do not allocate extra space for another array, you must do this in place with constant memory.
**The order of elements can be changed. It doesn't matter what you leave beyond the new length.
** @Author: Venkata Nagendra Kumar Pasupula
**/

public class RemoveElement{
	 public int removeElement(int[] nums, int val) {
       int counter=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] !=val){
				nums[counter]=nums[i];
				counter++;	
			}
		}
		return counter;
    }
	public static void main(String[] args){
		RemoveElement re = new RemoveElement();
		int[] arr = {1,2,3,4,3,3,3,5,6,3};
		int len = re.removeElement(arr,3);
		System.out.println(len);
	}
}