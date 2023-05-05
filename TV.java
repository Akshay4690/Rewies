package Review2;
// Vishlesha1
public class TV 
{
	private String brand;
	private int size;
	private double price;
	    
	public TV(String brand, int size, double price)
	{
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	    
	public double calculateDiscount()
	{
		double discount = 0;
		if (size > 50) 
		{
			discount = 0.2 * price;
		} 
		else if (size > 40) 
		{
			discount = 0.1 * price;
		}
		return discount;
	}
	    
	public void printTV() 
	{
		double discountedPrice = price - calculateDiscount();
		System.out.println("Brand: " + brand);
		System.out.println("Size: " + size + " inches");
		System.out.println("Discounted Price: " + discountedPrice);
	}
}

