/**
@Author: Venkata Nagendra Kumar pasupula
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.


**/



public class MaxArea {
    public static int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int area=0;
        while(i<j){
                area= Math.max((j-i)*Math.min(height[i],height[j]), area);
                if(height[i] < height[j]) i++;
                else j--;
        }
        return area;
    }
	public static void main(String[] args){
	System.out.println(maxArea(new int[]{2,3,10,5,7,8,9}));
	}
}