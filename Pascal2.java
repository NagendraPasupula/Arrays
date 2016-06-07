/**
**Given an index k, return the kth row of the Pascal's triangle.
For example, given k = 3,
Return [1,3,3,1].
**@Author: Venkata Nagendra Kumar Pasupula
**/
import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
/*	public List<Integer> getRow(int rowIndex) {
	    List<Integer> res = new ArrayList<Integer>();
    	double num=fact(rowIndex);
	    for(int i=0;i<=rowIndex;i++)
	    {
	    	double den = fact(i)*fact(rowIndex-i);
	        res.add((int) (num/den));
	    }
	    return res;
	}
	public double fact(int element){
		double res = 1;
		for(int i=element;i>0;i--){
			res *=i;
		}
		return res;
	}*/
	public List<Integer> getRow(int rowIndex) {
	ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i=0;i<=rowIndex;i++)
    {
        for(int j=result.size()-2;j>=0;j--)
        {
            result.set(j+1,result.get(j)+result.get(j+1));
        }
        result.add(1);
    }
    return result;
    }
	public static void main(String[] args){
		Pascal2 pas = new Pascal2();
		List<Integer> lis = pas.getRow(1);
			System.out.println(lis);
		
	}
}
