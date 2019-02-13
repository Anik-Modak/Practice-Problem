package ForwardDifference;

import java.util.Scanner;

import main.Lagrange;

public class Main 
{
	public static double xr[] = new double[10];
	public static double yr[] = new double[10];
	public static double fdtable[][] = new double[10][10];
	
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
		makeTable(points);
		ForwardDiff obj = new ForwardDiff();
		
		double h, u; 
        h = xr[1]-xr[0]; 
        u = (x-xr[0])/h;
        
		double ans = obj.calculate(u, points, fdtable);
		System.out.println("The Result: "+ ans);
		
	}
	
	public static void makeTable(int points)
	{
        for(int i=0; i<points; i++)
        {
            fdtable[i][0]=yr[i];
        }
    
        for(int i=1; i<points; i++)
        {
            for(int j=0; j<points-i; j++)
            {
                fdtable[j][i]=fdtable[j+1][i-1]-fdtable[j][i-1];
            }
        }
    }

}

/*simple inout
7
0.61 1.840431
0.62 1.858928
0.63 1.877610
0.64 1.896481
0.65 1.915541
0.66 1.934792
0.67 1.954237
0.644
The Result: 1.9040822746624
*/