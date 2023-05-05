package Review2;
//Shreyas2
import java.util.Scanner;	
public class PositonArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n = sc.nextInt();	
		int arr[]= new int[n+2];  
		 arr[n]=0;
		int temp=0;
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			int a =sc.nextInt();	
			arr[i]=a;
		}
		
		System.out.println("Enter element for insertion");	
		int num = sc.nextInt();	
		System.out.println("Enter index for insertion")	;
		int indx = sc.nextInt();
		for(int i=0;i<n+1;i++)
		{
			if(i==indx)
			{
				temp=arr[i];	
				arr[i]=num;
				num=temp;
			}
			else if(i>=indx)
			{
				arr[i]=temp;	
				temp=arr[i+1];
			}
		}
		
		System.out.println("Element after insertion are ");
		for(int i=0;i<=n;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
}
