import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Array ao = new Array();

		System.out.println();
		System.out.println("  LINEAR  SEARCH  ");
		System.out.println();

		int arr[] = ao.readArray();

		System.out.print("Enter Element to Search : ");
		int num = sc.nextInt();

		int ind = linearSearch(arr,num);

		if(ind==-1)
			System.out.println("Element not Present");
		else
			System.out.println(num+" present at index number "+ind);
	}

	static int linearSearch(int[]arr,int num)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				return i;
		}
		return -1;
	}	
}