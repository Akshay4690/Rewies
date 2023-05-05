package Review2;
//Vishlesha1

public class TvDriver
{
	public static void main (String [] args)
	{
		TV samsungTV = new TV("Samsung", 54, 1000.0);
		double discount = samsungTV.calculateDiscount();
		System.out.println("Discount: " + discount);
		samsungTV.printTV();
	}
}
