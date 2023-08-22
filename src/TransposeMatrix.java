
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Please enter number of columns");
		int cols = sc.nextInt();
		
		int matrix[][]=new int[rows][cols];
		int transpose[][]=new int[cols][rows];
		
		System.out.println("Please enter data for matrix");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print the input matrix");
		
		for(int b[]:matrix)
		{
			System.out.println(Arrays.toString(b));
		}
		
		/*
		 * for(int i=0;i<rows;i++) { for(int j=0;j<cols;j++) {
		 * System.out.print(matrix[i][j]+" "); } System.out.println(); }
		 */
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
			
		}
		
		System.out.println("Print the transpose matrix");
		for(int a[]:transpose)
		{
			System.out.println(Arrays.toString(a));
		}
		
		

	}

}
