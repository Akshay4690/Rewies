package Review;

public class MoviesDriver {
	public static void main (String [] args)
	{
	  MovieTheater theater = new MovieTheater();

	    theater.addMovie(new Movie("Son Of Sardar", 2012));
	    theater.addMovie(new Movie("The Scam", 2020));
	    theater.addMovie(new Movie("Ek Tha Tiger", 2014));
	 
	    Movie movie = theater.searchMovie("The Godfather");
	    if (movie != null)
	    {
	     System.out.println("Found movie: " + movie.getTitle() + " (" + movie.getReleaseYear() + ")");
	 } else {
	     System.out.println("Movie not found.");
	 }
	}
}
