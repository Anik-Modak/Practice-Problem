package SecantMathod;

public class Secant 
{
	public static double EPS = 0.00001;
			
	public double f(double x) 
	{ 
	    return x*x*x- x- 1; 
	} 

	double solved(double b, double c)
	{
		do
		{    
			double a = b;                
			b = c; 
		    c = b-(b-a)/(f(b)-f(a))*f(b);  
		    if (f(c)== 0.0)
		    {
		        return c;
		    }
		}while(Math.abs(c-b)>= EPS); 
		
		return c;
	}
}
