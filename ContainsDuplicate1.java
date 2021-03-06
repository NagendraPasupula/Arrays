

/**
** Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
**
**@Author: Venkata Nagendra Kumar Pasupula
**/
import java.util.HashMap;
import java.util.Map;
public class ContainsDuplicate1 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				if(i-map.get(nums[i])<=k) return true;
				else map.put(nums[i], i);
			}else{
				map.put(nums[i], i);
			}
		}
		return false;
	}
public static void main(String[] args){
	ContainsDuplicate1 cd = new ContainsDuplicate1();
	int[] nums={1,2,3,4,1,2,1,4};
	boolean val = cd.containsNearbyDuplicate(nums, 1);
	System.out.println(val);
}
}
