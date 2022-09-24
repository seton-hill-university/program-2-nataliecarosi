// //Application:   Project 1
//Name:          Natalie Carosi
//GitHub User:   nataliecarosi
//Date           September 22, 2022
//Version        1.0
//Description:   Scanner
//importing scanner
import java.util.Scanner;


public class Natalie2 {

	public static void main(String[] args) {
		// activating keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//storing numbers
		System.out.println("What is your favorite number?");
		int favorite = keyboard.nextInt();
		
		System.out.println("What is your least favorite number?");
		int leastfavorite = keyboard.nextInt();
		
		System.out.println("What is your second favorite number?");
		int secondfavorite = keyboard.nextInt();
		
		//preparing the display assignments
		System.out.println ("Select a mathematical operation");
		System.out.println ("1 Add \n2 Subtract \n3) Multiply \n4) Divide");
		
		
		int add = favorite + leastfavorite; 
		int subtract = favorite - leastfavorite;
		int multiply = favorite * leastfavorite;
		int divide = favorite / leastfavorite; 
		
		//User chooses options and program is executed
		switch (keyboard.nextInt())
		{
		
		case 1:
		//sum is displayed
		System.out.println("the sum of the numbers is " + add);
		
		if (add>secondfavorite)
		{ 
			System.out.println (add + " > " + secondfavorite ); 
		} 
		
		if (add<secondfavorite)
		{ 
			System.out.println (add + " < " + secondfavorite ); 
		}
		 break;
		case 2:
		//difference is displayed
			System.out.println("the difference of the numbers is " + subtract);
			if (subtract>secondfavorite)
			{ System.out.println (subtract + " > " + secondfavorite ); 
			} 
			
			if (subtract<secondfavorite)
			{ 
				System.out.println (subtract + " < " + secondfavorite ); 
			}
			break;
			
		case 3:
			//product is displayed
			System.out.println("the product of the numbers is " + multiply);
			if (multiply >secondfavorite)
			{ System.out.println (multiply + " > " + secondfavorite ); 
			} 
			
			if (multiply<secondfavorite)
			{ 
				System.out.println (multiply + " < " + secondfavorite ); 
			}
			break;
		case 4:
		//quotient is displayed
			System.out.println("the quotient of the numbers is " + divide);
			if (divide>secondfavorite)
			{ System.out.println (divide + " > " + secondfavorite ); 
			} 
			
			if (divide<secondfavorite)
			{ 
	           System.out.println (divide + " < " + secondfavorite ); 
			}
			break;
			
			
			
			
			
		
		
		
		
			
		}		
	}
	
}
