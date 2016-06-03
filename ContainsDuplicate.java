

/**
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * @Author: Venkata Nagendra Kumar Pasupula
 *
 */
import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        if(nums.length==0  || nums.length==1) return false;
	        Set<Integer> set = new HashSet<>(nums.length-1);
	        int counter =0;
	        for(int i:nums){
	            if(set.contains(i)) return true;
	            if(counter == nums.length) return false;
	            set.add(i);
	            counter++;
	        }
	        return false;
	    }
	 public static void main(String[] args){
		 ContainsDuplicate cd = new ContainsDuplicate();
		 int[] nums = {1,2,3,4,5,6,1};
		 boolean result =  cd.containsDuplicate(nums);
		 System.out.println(result);
	 }
}
