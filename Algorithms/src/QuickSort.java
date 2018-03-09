import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class QuickSort 
{
	ArrayList<Integer> Numbers;
	int N;
	public QuickSort()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of Input");
		N=scan.nextInt();
		Numbers=new ArrayList<Integer>(N);
	    System.out.println("Enter "+N+" numbers");
	    
	    for(int i=0;i<N;i++)
	    {
	    	Numbers.add(scan.nextInt());
	    }
	    Numbers=QSort(Numbers,0,N);
	}
	
	public ArrayList<Integer> QSort(ArrayList<Integer> Numbers,int left,int right)
	{
		if(left<right)
		{
			Random rand=new Random();
			int pivot=Numbers.get(rand.nextInt());
			int mid=partition(Numbers,left,right);
			QSort(Numbers,left,mid-1);
			QSort(Numbers,mid+1,right);
			return Numbers;
		}
		return Numbers;
	}
	
	public int partition(ArrayList<Integer> numbers, int left, int right) 
	{
		
		return 0;
	}

	public ArrayList<Integer> Select(ArrayList<Integer> Numbers)
	{
		
		return Numbers;
	}
	
	
	

}
