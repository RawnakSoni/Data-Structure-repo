import java.util.Scanner;
public class Array
{
	int[] readArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of an Array :");
		int n = s.nextInt();
		int []a = new int[n];
		System.out.println("Enter "+n+" Values in an Array :");
		for(int i=0;i<a.length;i++)
		{	
			a[i]=s.nextInt();
		}
		return a;
	}

	public void dispArray(int[] a)
	{ 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}