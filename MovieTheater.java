package Review;
import java.util.ArrayList;
import java.util.List;

public class MovieTheater {
	
	    private List<Movie> movies;
	    private int numMovies;
	    
	   
	    public MovieTheater() 
	    {
	        this.movies = new ArrayList<Movie>();
	        this.numMovies = 0;
	    }
	    
	    public void addMovie(Movie movie) {
	        this.movies.add(movie);
	        this.numMovies++;
	    }
	    public void removeMovie(Movie movie) {
	        this.movies.remove(movie);
	        this.numMovies--;
	    }
	    
	    public Movie searchMovie(String title) {
	        for (Movie movie : this.movies) {
	            if (movie.getTitle().equals(title)) {
	                return movie;
	            }
	        }
	        return null;
	    }
	    
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
	    
