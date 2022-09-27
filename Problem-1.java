
import java.util.*;

class Calculator {
	
	double a, b;
	String typeOfOperation;
	
	public Calculator(double a, double b, String typeOfOperation)
	{
		this.a = a;
		this.b = b;
		this.typeOfOperation = typeOfOperation;
	}
	
	public double add() 
	{
		return a+b;
	}
	
	public double subtract() 
	{
		return a-b;
	}
	
	public double multiply() 
	{
		return a*b;
	}
	
	public double divide() 
	{
		if(b == 0)
		{
			System.err.println("Arithmetic Exception - Division by zero");
			return a/b;
		}
		else
			return a/b;
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		double ans = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double a = scan.nextDouble();
		
		System.out.println("Enter the second number");
		double b = scan.nextDouble();
		
		System.out.println(" ------ Operations performed -----\n(Enter your option exactly as given below)\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n\n - Enter the operation to be performed");
		scan.nextLine();
		String typeOfOperation = scan.next();
		
		Calculator calc = new Calculator(a, b, typeOfOperation);
		
		if (typeOfOperation.equals("addition") || typeOfOperation.equals("Addition") )
		{
			ans = calc.add();
			System.out.println("The answer of " + typeOfOperation.toLowerCase() + " operation is: " + ans);
		}

		else if (typeOfOperation.equals("subtraction") || typeOfOperation.equals("Subtraction"))
		{
			ans = calc.subtract();
			System.out.println("The answer of " + typeOfOperation.toLowerCase() + " operation is: " + ans);
		}
		
		else if (typeOfOperation.equals("multiplication") || typeOfOperation.equals("Multiplication")  )
		{
			ans = calc.multiply();
			System.out.println("The answer of " + typeOfOperation.toLowerCase() + " operation is: " + ans);
		}
			
		else if (typeOfOperation.equals("division") || typeOfOperation.equals("Division") )
		{
			ans = calc.divide();
			System.out.println("The answer of " + typeOfOperation.toLowerCase() + " operation is: " + ans);
		}
			
		else
		{
			System.out.println("\n\tInvalid operation input. Please try again.");
		}
		scan.close();
	}
}
