package components;
import java.util.Scanner;
import javax.swing.*;
public class quiz3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("input your maximum value for an array");
		int arrayValue=input.nextInt();
		int []array1= new int[arrayValue];

		acsending(array1, arrayValue);
		decsending(array1, arrayValue);
	}
	private static void acsending(int[] array1, int arrayValue)
	{
		for (int value=0;value<arrayValue; value++)//values are assigned to the array in any order
		{
			int assignedValue =(int)(Math.random() *10);
			array1[value]=assignedValue;
			System.out.println("assigned asending value "+array1[value]);
		}
		for(int value=0;value<array1.length;value++)//nested for/if loop will arrange in ascending order
		{
			for(int value2=0;value2<array1.length-1;value2++)
			{
				if(array1[value2]>array1[value2+1])
				{
					int temp=array1[value2];
					array1[value2]=array1[value2+1];//if they are in the wrong order they will switch
					array1[value2+1]=temp;
				}	
			}	
		}	
		for (int value=0;value<array1.length;value++)
		{
			System.out.println("array1 value "+ array1[value]);
		}
	}
	private static void decsending(int[] array1, int arrayValue)
	{	
		System.out.println("descending order ");
		for(int value=0;value<array1.length;value++)//nested for/if loop will arrange in descending order
		{
			for(int value2=0;value2<array1.length-1;value2++)
			{
				if(array1[value2]<array1[value2+1])
				{
					int temp=array1[value2];
					array1[value2]=array1[value2+1];//if they are in the wrong order they will switch
					array1[value2+1]=temp;
				}	
			}	
		}
		for (int value=0;value<array1.length;value++)
		{
			System.out.println("array1 value "+ array1[value]);
		}
	}
}