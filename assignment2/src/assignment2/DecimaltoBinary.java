package assignment2;

import java.util.Arrays;
import java.util.Scanner;

	public class DecimaltoBinary 
		{
		public static void main (String[] args)
		{
			//ask user input and switch from string to int
			
			Scanner input = new Scanner (System.in);
			System.out.println("Enter a decimal number and this program will display the binary equivalent:");
			String s = input.nextLine();
			int x = Integer.parseInt(s);
			
			//print results
			System.out.println("The binary equivalent of " + s + " is: ");
			calculations(x);
		}
			// function to convert decimal to binary
			static void calculations(int x)
			{
				// array to store binary number
				int Array[]; //declare array with type and variable
				Array = new int[2000]; //allocate memory to array

				int y = 0;
				while (x > 0)
				{
					// calculating and storing remainder
					Array[y] = x % 2; //must come first
					x = x / 2;
					y++;
				}
				// printing results in reverse
				for (int i = y - 1; i >= 0; i--)
				{
					System.out.print(Array[i]);
				}
			}
	}
