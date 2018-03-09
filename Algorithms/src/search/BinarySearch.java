package search;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

	int n;
	int item;
	ArrayList<Integer> num=new ArrayList<Integer>();
	
	//constructor to input the data
	public BinarySearch(Scanner scan)
	{
		System.out.println("Enter Size of Input");
		n=scan.nextInt();
		System.out.println("Enter "+n+" Sorted Numbers");
		for(int i=0;i<n;i++)
		{
			num.add(scan.nextInt());
		}
		System.out.println("Input element to be seached");
		item=scan.nextInt();
		bSearch();
	}
	
	//wrapper to call binary search
	public void bSearch()
	{
		int result=bSearcher(0,n-1);
		if(result==-1)
		{
			System.out.println(item+" not found");
			
		}
		else
		{
			System.out.println(item+" found at position "+(result+1));
		}
	}
	
	//binary search
	public int bSearcher(int start, int end)
	{
		int mid=(start+end)/2;
		int middleElement;
		int element;

		if(start>end)
		{
			return -1;
		}
		middleElement=num.get(mid);
		if(item==middleElement)
		{
			return num.indexOf(item);
		}
		else if(item>middleElement)
		{
			element=bSearcher(mid+1,end);
		}
		else
		{
			element=bSearcher(start,mid-1);
		}
		return element;
	}	
}
