/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * @Author: Venkata Nagendra Kumar Pasupula
 * Solution: Using XOR (^) can eliminate the duplicate numbers
 */
public class SingleNumber {
	    public int singleNumber(int[] nums) {
	        int result=nums[0];
	        for(int i=1;i<nums.length;i++){
	            result = result^nums[i];
	        }
	        return result;
	    }
	    public static void main(String[] args){
	    	int[] nums = {1,2,3,4,5,4,3,2,1};
	    	SingleNumber sn =  new SingleNumber();
	    	System.out.println(sn.singleNumber(nums));
	    }
}
	