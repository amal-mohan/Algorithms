package search;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch 
{
	int n;
	ArrayList<Integer> num=new ArrayList<Integer>();
	int item;
	public LinearSearch(Scanner scan)
	{
		System.out.println("Input number of elements");
		n=scan.nextInt();
		System.out.println("Input "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			num.add(scan.nextInt());
		}
		System.out.println("Enter element to be seached");
		item=scan.nextInt();
		LSearch();
	}
	
	public void LSearch()
	{
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(item==num.get(i))
			{
				System.out.println("Element found at "+(num.indexOf(item)+1));
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found");		
		}
	}
}
