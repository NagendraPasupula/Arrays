/**
* @Author : Venkata Nagendra Kumar Pasupula
* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
**/

import java.util.Stack;
public class ValidParenthasis {
	 public static boolean isValid(String s) {
	        Stack<Character> st = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            if(st.empty()){
	                st.push(s.charAt(i));
	            }
	            else if(st.peek()=='(' && s.charAt(i)== ')'  || st.peek()=='{' && s.charAt(i)=='}' || st.peek()=='[' && s.charAt(i)==']'){
	                st.pop();
	            }
	            else{
	                st.push(s.charAt(i));
	            }
	        }
	        return st.empty()?true:false;
	        
	    }
	 public static void main(String[] args){
		 System.out.println(isValid("[{}()]"));
	 }
	 
}
