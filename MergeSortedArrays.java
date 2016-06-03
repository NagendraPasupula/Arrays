/**
**Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
**@Author: Venkata Nagendra Kumar Pasupula
**/

public class MergeSortedArrays{
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m+n;
        while(m>0 && n>0){
			if(nums1[m-1] > nums2[n-1]){
				nums1[m+n-1]=nums1[m-1];
				m--;
			}else{
				nums1[m+n-1]=nums2[n-1];
				n--;
			}
		}
		if(n>0)System.arraycopy(nums2,0,nums1,0,n);
		for(int i=0;i<k;i++)
			System.out.print(nums1[i]+"\t");
    }
	public static void main(String[] args){
		MergeSortedArrays ma =  new MergeSortedArrays();
		int m = 6;
		int n = 5;
		int[] nums1 = {1,3,4,9,12,14,0,0,0,0,0};;
		int[] nums2 = {2,5,10,11,13};
		ma.merge(nums1,m,nums2,n);
	}

}