package Review2;
//Prakash1
public class Computer
{
	private String processor;
	private int RAM;
	private int storage;

	public Computer(String processor, int RAM, int storage)
	{
		this.processor = processor;
		this.RAM = RAM;
		this.storage = storage;
	}

	public double calculatePrice() 
	{
		double basePrice = 500.0;
		double processorPrice = 0.0;
		double RAMPrice = 0.0;
		double storagePrice = 0.0;

		// Calculate the price of the processor based on its brand
		if (this.processor.equalsIgnoreCase("Intel")) 
		{
			processorPrice = 200.0;
		}
		else if (this.processor.equalsIgnoreCase("AMD")) 
		{
			processorPrice = 150.0;
		}

	
		if (this.RAM == 8) 
		{
			RAMPrice = 100.0;
		}
		else if (this.RAM == 16) 
		{
			RAMPrice = 200.0;
		}

	      
		if (this.storage == 256)
		{
			storagePrice = 50.0;
		} else if (this.storage == 512)
		{
			storagePrice = 100.0;
		}
	    
		double totalPrice = basePrice + processorPrice + RAMPrice + storagePrice;
		return totalPrice;
	}

	public void printDetails() 
	{
		System.out.println("Processor: " + this.processor);
		System.out.println("RAM: " + this.RAM + "GB");
		System.out.println("Storage: " + this.storage + "GB");
	}

	public static void main(String[] args)
	{
		Computer myComputer = new Computer("Intel", 16, 512);
		myComputer.printDetails();
		System.out.println("Price: " + myComputer.calculatePrice());
	}
}


