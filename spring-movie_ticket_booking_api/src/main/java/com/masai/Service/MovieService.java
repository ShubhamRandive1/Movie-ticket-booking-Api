package com.masai.Service;

import java.util.List;

import com.masai.Model.Movie;

public interface MovieService {
	
	Movie addMovie(Movie movie);
	
	Movie updateMovie(Movie movie);
	
	Movie removeMovie(Movie movie);
	
	Movie viewMovie(int movieId);
	
	List<Movie> viewMovieList();

}
