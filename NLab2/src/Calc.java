import java.util.Scanner;
import Lab2.Calculator;

public class Calc 
{
	public static void main( String[] args )
	{
		double n1,n2=0.0;
		String op=null;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		n1=num.nextDouble();
		
		System.out.println("Enter the second number: ");
		n2=num.nextDouble();
		
		Scanner operation= new Scanner(System.in);
		System.out.println("Enter the operation +,-,/,*: ");
		op=operation.next();
		
		Calculator c=new Calculator();
		double a=c.calculate(n1,n2,op);
		System.out.println("The result is: "+a);
	}
}
