package Problem3;

public class ProbSolve
{
	//Copy all elements within data structure into an array
	//Perform binary search on the array in order to find the number that is being searched
	
	public static int binarySearch(int[] a, int i)
	{
		//find the middle, high ,and low index
		int found=0;
		int mid=(a.length)/2;
		int lo=0;
		int hi=a.length;
		if(i==a[mid])
		{
			found=mid;
			return found;
		}
		else if(i<a[mid])
		{
			//binary search on left half
		}
		else
		{
			//binary search on right half
		}
		//this will be a recursive property and the value will end up being the element of a[mid] after some recursions.
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,5,8,10,12,14,18,20,33,41};
		
	}
}