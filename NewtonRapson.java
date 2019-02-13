package NewtonRapsonMethod;

public class NewtonRapson 
{
	static final double EPSILON = 0.00001; 

	static double func(double x) 
	{ 
		return x * x * x - 2 * x * x + 2; 
	} 

	static double derivFunc(double x) 
	{ 
		return 3 * x * x - 4 * x; 
	} 

	static void newtonRaphson(double x) 
	{ 
		double h = 1; 
		while (Math.abs(h) >= EPSILON) 
		{ 
			h = func(x) / derivFunc(x); 
			x = x - h; 
		} 

		System.out.println("The value of the root is : " + x); 
		
	} 
}
