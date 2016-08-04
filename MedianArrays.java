/***
** There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)). 
**@Author: Venkata Nagendra Kumar Pasupula
**
**/

public class MedianArrays{

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int len1 = nums1.length;
			int len2 = nums2.length;
			double med1 = (len1%2==0)?((double)(nums1[len1/2]+nums1[(len1/2)+1])/2):nums1[(len1/2)+1];
			double med2 = (len2%2==0)?((double)(nums2[len2/2]+nums2[(len2/2)+1])/2):nums2[(len2/2)+1];
			if(med1 == med2) return med1;
			if(len1%2==0  && len2%2==0){
				if(med1 < med2) return (double)(nums1[len1-1]+nums2[0])/2;
				else return (double)nums1[len1];
			}
			else if(med1 > med2) return (double)(nums1[len1-1]+nums2[0])/2;
			else return (double)(nums2[len2-1]+nums1[0])/2;
    }

	
	public static void main(String[] args){
		int[] nums1 ={1,2,3,4,5};
		int[] nums2 ={6,7,8,9,10};
		MedianArrays ma = new MedianArrays();
		double median = ma.findMedianSortedArrays(nums1,nums2);
		System.out.println(median);
	}
}
