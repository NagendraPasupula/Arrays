/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
 * You may assume that the array is non-empty and the majority element always exist in the array

 * @Author: Venkata Nagendra Kumar Pasupula
 * Moore's Voting Algorithm implementation: O(n) time complexity
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int counter=0, current = nums[0];
		for(int i=0;i<nums.length;i++){
			if(counter==0){
				current = nums[i];
				counter =1;
			}else if(nums[i]== current)
				counter++;
			 else counter--;
		}
		int count=0;
		for(int j=0;j<nums.length;j++){
			if(nums[j]==current) count++;
		}
		if(count>(nums.length/2)) return current;
		else return 0;
    }
	public static void main(String[] args){
		MajorityElement me= new MajorityElement();
		int[] arr = {1,2,3,5,4,5,4,4,4,4,4};
		int temp = me.majorityElement(arr);
		System.out.println(temp);
	}
}
