package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("What is your monthly budget: $");
		double budget = stdIn.nextDouble();
		double sum = 0;
		int i = 0;
		
		ArrayList<Double> proportion = new ArrayList<Double>();
		System.out.println("\nThe system stops if cummulative proportion exceeds 100 percent.");
		System.out.print("\nEnter your proportion of various expenses in percentage.");
		
		do 
		{
			System.out.print("\nYour proportion of expense " + (i+1) + ": ");
			double value = stdIn.nextDouble();
			proportion.add(value);
			sum += proportion.get(i);
			i++;
		}
		while (sum <= 100); 	
			stdIn.close();
			if (sum > 100) 
			{
				double cummulativeSum = 0;
		
				for (int j = 0; j < proportion.size() - 1; j++) 
				{
					cummulativeSum += proportion.get(j);
				}
				proportion.set(proportion.size() - 1, 100 - cummulativeSum);
			}
			
			for (double value : proportion) 
			{
				double expense = (value * budget) / 100;
				System.out.println("\nYour " + value + "% equals $" + expense);
			}
	}
}
