package ForwardDifference;

public class ForwardDiff
{
	double calculate(double u, int points, double[][] fdtable)
	{
        double sum = 0, tmpu = 1;
      
        for(int i=0; i<points; i++)
        {
            sum +=  (tmpu/fact(i)) * fdtable[0][i];
            tmpu *= (u-i);
        }
        return sum;
    }
	
	int fact(int n)
	{
		if(n <= 1) return 1;
		return n*fact(n-1);
	}
}
