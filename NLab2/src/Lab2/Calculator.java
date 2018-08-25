package Lab2;

import java.util.Scanner;


public class Calculator 
{
	public double calculate(double n1, double n2, String op)
	{
		if(op.equals("+"))
			return n1+n2;
		else if(op.equals("-"))
			return n1-n2;
		else if(op.equals("/"))
			return n1/n2;
		else if(op.equals("*"))
			return n1*n2;
		else 
			System.err.print("Please enter valid argument");
			return 0;
	}
}
