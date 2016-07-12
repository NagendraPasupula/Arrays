/**
** Given a sorted integer array without duplicates, return the summary of its ranges.
** For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
**/


import java.util.List;
import java.util.ArrayList;
public class Ranges {
	    public List<String> summaryRanges(int[] nums) {
	        List<String> result = new ArrayList<String>();
	        if(nums.length==1)
	        	result.add(Integer.toString(nums[0]));
	        for(int i=0;i<nums.length-1;i++){
	             int start = nums[i];
	            while(i<nums.length-1){
	            	if(nums[i+1]==(nums[i]+1))
	            		i++;
	            	else
	            		break;
	            }
	              int end = nums[i];
	            
	            if(start==end)
	                result.add(Integer.toString(start));
	            else
	                result.add(Integer.toString(start)+"->"+Integer.toString(end));
	            if(i==nums.length-2 && (nums[i]+1)!=nums[i+1])
	            	result.add(Integer.toString(nums[i+1]));
	        }
	        
	        return result;
	    }
public static void main(String[] args){
	Ranges r = new Ranges();
	int[] nums = {0,1,2,4,5,6,8};
	List<String> temp = r.summaryRanges(nums);
	System.out.println(temp);
}
}
