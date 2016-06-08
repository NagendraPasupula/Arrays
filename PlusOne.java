/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * @Author: Venkata Nagendra Kumar Pasupula
 *
 */
public class PlusOne {

	 public int[] plusOne(int[] digits) {
	        int carry=1;
	        for(int i=digits.length-1;i>=0;i--){
	        		int sum = digits[i]+carry;
	                digits[i] = (sum)%10;
	                carry= (sum)/10;
	        }
	        if(carry==1){
	            int[] digits1 = new int[digits.length+1];
	            digits1[0]=1;
	            System.arraycopy(digits,0,digits1,1,digits.length);
	            return digits1;
	        }
	        return digits;
	    }
	 public static void main(String[] args){
		 PlusOne po = new PlusOne();
		 int[] digits={9,9,9,9};
		 int[] temp = po.plusOne(digits);
		 for(int i=0;i<temp.length;i++)
		 System.out.println(temp[i]);
	 }
}
