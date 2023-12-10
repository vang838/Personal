package main;

import java.util.Scanner;
import java.text.*;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter your buying price per share: ");
		double buyingPrice = stdIn.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		DecimalFormat dF = new DecimalFormat("0.00");
		
		
		while (true) 
		{
			System.out.print("\nEnter the closing price for day " + day + " (Type -1 to leave): ");
			closingPrice = stdIn.nextDouble();
			double earnings = closingPrice - buyingPrice;
			
			if(closingPrice == -1) 
			{	
				System.out.println("\nPlease don't forget to tell your friends about Avalon's Financial Brokerage");
				break;
			}
			if (earnings > 0) 
			{
				System.out.print("After Day " + day + " , you have earned " + dF.format(earnings) + " per share.");
			}
			else if (earnings < 0) 
			{
				System.out.print("After Day " + day + " , you have lost " + dF.format(-earnings) + " per share.");
			}
			else 
			{
				System.out.print("After Day " + day + " , you have not earned anything per share.");
			}
			day += 1;
		}
		
		stdIn.close();

	}

}
