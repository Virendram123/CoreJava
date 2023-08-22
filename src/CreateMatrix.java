import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of rows:");
		int rows = sc.nextInt();
		
		System.out.println("Please enter number of columns:");
		int cols = sc.nextInt();
		
		int matrix[][]=new int[rows][cols];
		
		System.out.println("Please enter matrix input data:");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print the input matrix");
		/*
		 * for(int i=0;i<rows;i++) 
		 * { 
		 *    for(int j=0;j<cols;j++) 
		 *    {
		 *        System.out.print(matrix[i][j]+" "); 
		 *    } 
		 *        System.out.println(); 
		 * }
		 */
		
		/*
		 * for(int x[]:matrix) 
		 * { 
		 *    for(int y:x) 
		 *    { 
		 *        System.out.print(y+" "); 
		 *    }
		 *        System.out.println(); 
		 *  }
		 */
		
		/*
		 * for(int x[]:matrix) 
		 * { 
		 *      System.out.println(Arrays.toString(x)); 
		 * }
		 */
		
		 System.out.println(Arrays.deepToString(matrix));
		
	}

}
