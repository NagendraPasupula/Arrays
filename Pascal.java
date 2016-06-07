/**
**Given numRows, generate the first numRows of Pascal's triangle.
**@Author: Venkata Nagendra Kumar Pasupula
**/
import java.util.ArrayList;
import java.util.List;
public class Pascal{

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
			List l1 = new ArrayList<Integer>();
			for(int j=0;j<i+1;j++){
				if(i==0 || j==0 ||  i==j)	l1.add(1);
				else l1.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
			}
			result.add(l1);
		}
		return result;
    }
	public static void main(String[] args){
		Pascal pas = new Pascal();
		List<List<Integer>> temp = pas.generate(7);
		for(List<Integer> res:temp)
			System.out.println(res);
	}
}