package Problem1;

public class Sorting
{
	public static int[] ExamSort(int[] a, int size)
	{
		int min;
		for(int i=0; i<size; i++)
		{
			min=i;
			for(int j=i+1; j<size; j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			swap(a, min, i);
		}
		return a;
	}
	
	private static void swap(int[] arr, int a, int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	private static void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={15,9,60,44,12,1,4};
		int size=arr.length;
		int[] sorted=ExamSort(arr,size);
		print(sorted);
	}
}