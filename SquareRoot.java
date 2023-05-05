package LogicalProblem;

public class SquareRoot
{   
	public static double sqrt(double c)
	{
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c/t) > epsilon*t) 
		{
	            t = (c/t + t) / 2.0;
		}
	        return t;
	}

	    public static void main(String[] args)
	    {
	        double c = 2.0;
	        double sqrtC = sqrt(c);
	        System.out.println("Square root of " + c + " = " + sqrtC);
	    }
}

