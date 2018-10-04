package excercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [] arrayNums =new double [20];
		double total = 0;
		double avg = 0;
		int quit = 0;
		int i = 0;
		while (quit != 99999) {
			System.out.println("Enter a number >>");
			arrayNums[i] = input.nextDouble();
			i++;
			total = total + arrayNums [i];
			System.out.println("Total");
			System.out.println("Another number? to quit 99999");
			quit  = input.nextInt();
			
		}
	}

}
