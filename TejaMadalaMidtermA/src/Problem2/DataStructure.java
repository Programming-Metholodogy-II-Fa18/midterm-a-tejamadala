package Problem2;

public class DataStructure
{
	static int size;
	static Node start;
	
	public static class Node
	{
		int data;
		Node next;
	}
	
	public static void Data()
	{
		start=null;
		size=0;
	}
	
	public static void add(int a)
	{
		size++;
		if(size==1)
		{
			Node e=new Node();
			e.data=a;
			start=e;
			e.next=null;
		}
		else if(size>1)
		{
			Node ptr=new Node();
			ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			Node d=new Node();
			d.data=a;
			ptr.next=d;
		}
		
	}
	
	public static int remove()
	{
		int res=-1;
		if(size==0)
		{
			System.out.println("Cannot remove on an empty queue, returning -1.");
			return res;
		}
		else
		{
			res=start.data;
			start=start.next;
			return res;
		}
	}
	
	public static int getValue(int i)
	{
		int res;
		if(i>size-1)
		{
			return res=-1;
		}
		Node ptr=new Node();
		ptr=start;
		for(int j=0; j<i; j++)
		{
			ptr=ptr.next;
		}
		res=ptr.data;
		return res;
	}
	
	public static void print()
	{
		Node ptr=start;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args)
	{
		Data();
		add(1);
		add(9);
		add(4);
		add(5);
		add(10);
		add(0);
		//int rem=remove();
		//System.out.println(rem);
		//print();
		System.out.println(getValue(0));
		System.out.println(getValue(3));
	}
}