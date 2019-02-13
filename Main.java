package SecantMathod;

import java.util.Scanner;

import FalsePositionMethod.FalsePosition;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Secant obj = new Secant();

		double a = in.nextDouble();
		double b = in.nextDouble();
		
		double ans = obj.solved(a, b);
		System.out.println("The result: " + ans);
	}
}
