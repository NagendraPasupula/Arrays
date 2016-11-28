	/***
 * 
 * @author Venkata Nagendra Kumar Pasupula
 * 
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].
 *
 */
public class SlidingWindow {

	 public int[] maxSlidingWindow(int[] nums, int k) {
	        if(nums.length <k || k<=0) return (new int[]{});
	        int[] result = new int[nums.length-k+1];
	        int n=0;
	        for(int i=0;i<nums.length-k+1;i++){
	            int temp = Integer.MIN_VALUE;
	            for(int j=i;j<i+k;j++){
	                temp = Math.max(temp,nums[j]);
	            }
	            result[n++]=temp;
	        }
	        return result;
	    }
	public static void main(String[] args){
		SlidingWindow sw = new SlidingWindow();
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k=3;
		int[] result = sw.maxSlidingWindow(nums, k);
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
