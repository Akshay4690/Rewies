package Review2;
//Shreyas1
public class Furniture 
{
	private String type;
	private String material;
	private double price;

	public Furniture(String type, String material, double price) 
	{
		this.type = type;
		this.material = material;
		this.price = price;
	}

	public double calculateDiscount() 
	{
		double discount = 0.0;
		if (this.material.equalsIgnoreCase("wood"))
		{
			discount = 0.10 * this.price;
		}
		else if (this.material.equalsIgnoreCase("metal")) 
		{
			discount = 0.20 * this.price;
		} 
		else if (this.material.equalsIgnoreCase("plastic")) 
		{
			discount = 0.05 * this.price;
		}
	        return discount;
	}

	public void printDetails() 
	{
		double discountedPrice = this.price - calculateDiscount();
		System.out.println("Type: " + this.type);
		System.out.println("Material: " + this.material);
		System.out.println("Discounted price: " + discountedPrice);
	}

	public static void main(String[] args)
	{
		Furniture table = new Furniture("Table", "Wood", 100.0);
		table.printDetails();
	}
}

