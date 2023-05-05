package Review2;
//Dipti1

public class Shirt {

	private String size;
	private String color;
	private double price;

	public Shirt(String size, String color, double price) 
	{
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public double calculateDiscount()
	{
		double discount = 0.0;
		if (size.equalsIgnoreCase("small"))
		{
			discount = 0.1;
		} 
		else if
		(size.equalsIgnoreCase("medium")) 
		{
			discount = 0.2;
		}
		else if (size.equalsIgnoreCase("large")) 
		{
			discount = 0.3;
		}
	        return price - (price * discount);
	}

	public void printShirtDetails() 
	{
		System.out.println("Shirt size: " + size);
		System.out.println("Shirt color: " + color);
		System.out.println("Shirt price: " + price);
		System.out.println("Discounted price: " + calculateDiscount());
	}

	public static void main(String[] args) 
	{
		Shirt myShirt = new Shirt("medium", "blue", 25.0);
		myShirt.printShirtDetails();
	}
}


