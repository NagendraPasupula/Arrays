/**
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note: The solution set must not contain duplicate triplets.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	  public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(nums.length<3) return result;
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-2;i++){
	            int j=i+1;
	            int k = nums.length-1;
	            if(i>0 && nums[i]==nums[i-1]){
	            	continue;
	            }
	            while(j<k){
	                if(nums[i]+nums[j]+nums[k]==0){
	                    List<Integer> temp = new ArrayList<Integer>();
	                    temp.add(nums[i]);
	                    temp.add(nums[j]);
	                    temp.add(nums[k]);
	                    result.add(temp);
	                    j++;
	                    k--;
	                }else if(nums[i]+nums[j]+nums[k] >0){
	                    k--;
	                }else{
	                    j++;
	                }
	                while(j<k && nums[j]==nums[j-1]){
	                    j++;
	                }
	                if(k<nums.length-2){
	                while(j<k && nums[k]==nums[k+1]){
	                    k--;
	                }}
	            }
	           
	            
	        }
	        return result;
	    }
	  public static void main(String[] args){
		  ThreeSum ts = new ThreeSum();
		  int[] nums = {-1,0,1,2,-1,-4};
		  List<List<Integer>> temp = ts.threeSum(nums);

			  System.out.println(temp);
	  }
}
