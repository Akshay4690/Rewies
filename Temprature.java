package LogicalProblem;

public class Temprature 
{ 
	public static double Conversion(double temp, String Unit, String toUnit) 
	{
		if (Unit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit")) 
		{
			return (temp * 9/5) + 32;
	    }
		else if (Unit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) 
		{
			return (temp - 32) * 5/9;
	    } 
		else 
		{
			throw new IllegalArgumentException("Invalid units ");
	    }
	}
	
	public static void main(String[] args)
	{
		double fahrenheitTemp = 55;
		
		double celsiusTemp = Temprature.Conversion(fahrenheitTemp, "fahrenheit", "celsius");
		
		System.out.println(fahrenheitTemp + "°F is equivalent to " + celsiusTemp + "°C.");
	}

}


