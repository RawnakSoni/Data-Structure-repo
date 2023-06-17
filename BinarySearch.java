import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Array ao = new Array();

		System.out.println();
		System.out.println("  BINARY  SEARCH  ");
		System.out.println();

		int arr[] = ao.readArray();

		System.out.print("Enter Element to Search : ");
		int num = sc.nextInt();

		int ind = binarySearch(arr,num);

		if(ind==-1)
			System.out.println("Element not Present or Array isn't in Sorted Format");
		else
			System.out.println(num+" present at index number "+ind);
	}

	static int binarySearch(int[]arr,int num)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end)
		{
			
			int mid = start+(end-start)/2;

			if(num<arr[mid])
			{
				end = mid-1;
			}
			else if(num>arr[mid])		
			{
				start = mid+1;
			}
			else
			{
				return mid; 		
			}
		}
		return -1;
	}	
}