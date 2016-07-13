/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * @Author: Venkata Nagendra Kumar Pasupula
 *
 */
public class RotateMatrix {
	public void rotate(int[][] matrix) {
        int len = matrix.length-1;
     for(int i=0;i<(matrix.length)/2;i++){
         for(int j=0;j<(matrix.length+1)/2;j++){
             int temp = matrix[i][j];
             matrix[i][j]= matrix[len-j][i];
             matrix[len-j][i]=matrix[len-i][len-j];
             matrix[len-i][len-j]=matrix[j][len-i];
             matrix[j][len-i] = temp;
         }
     }
     for(int i=0;i<matrix.length;i++){
		 System.out.print("[");
		 for(int j=0;j<matrix.length;j++){
			System.out.print(matrix[i][j]);
		 System.out.print("\t");}
		 System.out.print("]");
		 System.out.println();
     }
    }
	public static void main(String[] args){
		RotateMatrix rm = new RotateMatrix();
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rm.rotate(matrix);	
	}
}
