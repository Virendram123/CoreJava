import java.util.Scanner;

public class TestArray {
	
	/*
	 * [1,3,5,8,9] difference = 3
	 * 
	 * return element position
	 */
	public static void main(String[] args) {
		int a[]= {1,2,5,6,9};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter difference: ");
		int diff = sc.nextInt();
		
		int n = a.length;
		
		System.out.println(n);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[j]-a[i])==diff)
				{
					System.out.println("a["+i+"]");
					System.out.println("a["+j+"]");
				}
			}
		}
		sc.close();

	}

}
