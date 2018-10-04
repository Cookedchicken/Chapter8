package excercises;

import java.util.Scanner;

public class ArrayMethodDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] arrayNums =new double [10];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < arrayNums.length; i++) 
		{
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble();
			
		}
		System.out.println("The output is:");
		for(int j=9; j >= 0; j--) 
		{
			System.out.println(arrayNums[j]);
		}
		System.out.println("The output in reverse order is:");
		for(int j=0; j >=9; j--) 
		{
			System.out.println(arrayNums[j]);
			sum = arrayNums[j] + sum;
		}
		
		
		
	}

}
