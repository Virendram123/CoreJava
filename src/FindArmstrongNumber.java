import java.util.Scanner;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		int temp=0, k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to check: -");
		int num = sc.nextInt();
		k=num;
		
		while(num>0)
		{
			int n = num%10; 
			temp = temp+(n*n*n); 
			num=num/10;
			
		}
		
		if(k==temp)
		{
			System.out.println(k+ " is a armstrong number!");
		}
		else
		{
			System.out.println(k+ " is not a armstrong number!");
		}
				
     
	}

}
