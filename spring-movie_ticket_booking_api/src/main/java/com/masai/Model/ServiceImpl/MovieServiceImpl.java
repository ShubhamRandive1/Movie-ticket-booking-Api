package com.masai.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Movie;
import com.masai.Repository.MovieRepository;
import com.masai.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	
	@Autowired
	private MovieRepository repo;

	@Override
	public Movie addMovie(Movie movie) {

		return repo.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return repo.save(movie);
	}

	@Override
	public Movie removeMovie(Movie movie) {
		repo.delete(movie);
		return movie;
	}

	@Override
	public Movie viewMovie(int movieId) {
		return repo.findById(movieId).orElse(new Movie());
	}

	@Override
	public List<Movie> viewMovieList() {
		return repo.findAll();
	}

}
