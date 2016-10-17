/** Power set of a string or all possible sub sequences of string **/

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
 
class Powerset
{
	public static ArrayList<String> subseq(String str,int start, StringBuffer sb, ArrayList<String> list)
	{
		for(int i=start; i< str.length(); i++)
		{
			sb.append(str.charAt(i));
			list.add(sb.toString());
			subseq(str, i+1, sb, list);
			sb.setLength(sb.length()-1);
		}
		return list;
	}

   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string:");
      String str  = in.nextLine(); 
      ArrayList<String> list = new ArrayList<String>();
      list= subseq(str,0, new StringBuffer(), list);
      String[] temp =  list.toArray(new String[0]);
      for(int j=0;j<temp.length;j++){
    	  System.out.println(temp[j]);
      }
 
      }
}