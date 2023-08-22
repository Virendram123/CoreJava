
public class FindNLargestElement {

	public static void main(String[] args) {
		int arr[]= {10, 20, 25, 63, 96, 57} ;
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-3]);
		
	}
}

