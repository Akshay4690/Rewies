package Review2;
//Rahul
public class Book
{	
	private String title;
	private String author;
	private int numPages;
	private double pricePerPage = 0.10;

	public Book(String title, String author, int numPages)
	{
		this.title = title;
		this.author = author;
		this.numPages = numPages;
	}

	public double calculatePrice()
	{
		return numPages * pricePerPage;
	}

	public void printBookInfo()
	{
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Number of pages: " + numPages);
	}
	    
	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getNumPages()
	{
		return numPages;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}

	public static void main(String[] args) 
	{
		Book book1 = new Book("Wings os fire", "A.p.j.Abdul kalam", 250);
		System.out.println("Price of " + book1.getTitle() + ": $" + book1.calculatePrice());
		book1.printBookInfo();
	}
}

