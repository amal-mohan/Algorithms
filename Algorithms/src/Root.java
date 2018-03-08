import java.util.Scanner;

import search.*;

public class Root {

	public static void main(String[] args)
	{
		int input;
		int option;
		Scanner scan=new Scanner(System.in);
		loop: while(true)
		{	
			System.out.println("Press: ");
			System.out.println("1. Seaching");
			System.out.println("2. Sorting");
			System.out.println("0. Exit");
			if(scan.hasNextInt())
			{
				input=scan.nextInt();
			}
			else
			{
				input=-1;
			}
			switch(input)
			{
			case 1:
				System.out.println("Press: ");
				System.out.println("1. Binary Search");
				option=scan.nextInt();
				switch(option)
				{
				case 1: 
					BinarySearch b=new BinarySearch(scan);
					b.bSearch();
					System.out.println("Binary Search Completed");
					break;
				default: System.out.println("Please enter a valid choice");
				}
				break;
			case -1: break;
			case 0: break loop;
			default: System.out.println("Please enter a valid choice");
			}
		}
		scan.close();
	}

}
