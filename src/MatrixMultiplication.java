import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of ros in first matrix:");
		int rowsInFirst=sc.nextInt();
		
		System.out.println("Enter no. of columns in first matrix and rows in second matrix:");
		int colsInFirstAndrowsInSecond=sc.nextInt();
		
		System.out.println("Enter no. of ros in column second matrix:");
		int colsInSecond=sc.nextInt();
		
		int matrix1[][]=new int[rowsInFirst][colsInFirstAndrowsInSecond];
		int matrix2[][]=new int[colsInFirstAndrowsInSecond][colsInSecond];
		int product[][]=new int[rowsInFirst][colsInSecond];
		
		System.out.println("Enter input for first matrix:");
		for(int i=0;i<rowsInFirst;i++)
		{
			for(int j=0;j<colsInFirstAndrowsInSecond;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter input for second matrix:");
		for(int i=0;i<colsInFirstAndrowsInSecond;i++)
		{
			for(int j=0;j<colsInSecond;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print first matrix data");
		for(int r[]:matrix1)
		{
			System.out.println(Arrays.toString(r));
		}
		
		
		System.out.println("Print second matrix data");
		for(int r[]:matrix2)
		{
			System.out.println(Arrays.toString(r));
		}
		
		//get the product
		
		for(int i=0;i<rowsInFirst;i++)
		{
			for(int j=0;j<colsInSecond;j++)
			{
				for(int k=0;k<colsInFirstAndrowsInSecond;k++)
				{
					product[i][j]+=matrix1[i][k]*matrix2[k][j];
							}
			}
		}
		
		//print the product
		
		System.out.println("Print product of two matrices");
		for(int r[]:product)
		{
			System.out.println(Arrays.toString(r));
		}
		
		
		
		
		
			
		
		

	}

}
