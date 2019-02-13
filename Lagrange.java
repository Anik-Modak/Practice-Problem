package Lagrange;

public class Lagrange 
{
	double calculate(double x,int points, double xr[], double yr[])
	{
		double result = 0;
		for (int i=0; i<points; i++)
		{
			double term = yr[i];
			for (int j=0; j<points; j++)
			{
				if (j != i )
					term *= (x - xr[j])/(xr[i] - xr[j]);
			}
			result += term;
		}
		return result;
	} 
}
