/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * @Author: Venkata Nagendra Kumar Pasupula
 *
 */
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index1 =0;
        for(int i=1;i<nums.length;i++){
            if(nums[index1]!=nums[i]){
                index1++;
                nums[index1]=nums[i];
            }
        }
        for(int i=0;i<index1+1;i++){
        	System.out.print(nums[i]+"\t");
        }
        return (index1+1);
    }
	public static void main(String[] args){
		RemoveDuplicates rd =  new RemoveDuplicates();
		int[] nums =  {1,1,2,2,3,3,3,4,4,4,4,5,6,7,8};
		int len= rd.removeDuplicates(nums);
		System.out.println("\nlength:"+len);
		
	}
}
