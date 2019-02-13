package Lagrange;

import java.util.Scanner;

public class Main 
{
	public static double xr[] = new double[10];
	public static double yr[] = new double[10];
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int points = in.nextInt();
		
		for(int i=0; i<points; i++)
		{
			xr[i] = in.nextDouble();
			yr[i] = in.nextDouble();
		}
		
		double x = in.nextDouble();
		Lagrange obj = new Lagrange();
		
		double ans = obj.calculate(x, points, xr, yr);
		System.out.println("The Result: "+ ans);
		
	}

}
