
public class LeaderNumbers {
	
	
	public static void findLeaders(int num[])
	{
		int max = num[num.length-1];
		System.out.print(max+" ");
		for(int i=num.length-2;i>=0;i--)
		{
			if(num[i]>max)
			{
				System.out.print(num[i]+" ");
				max=num[i];
			}
			
		}
		System.out.println();
	}

	public static void main(String[] args) {

    int num[]= {92,7,12, 9,8,3};
    
    int num1[]= {92,7,129,8,24,3};
    
    findLeaders(num);
    
    findLeaders(num1);

	}

}
