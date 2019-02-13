package NewtonRapsonMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		NewtonRapson obj = new NewtonRapson();

		double a = input.nextInt();
		obj.newtonRaphson(a); 
	}

}
