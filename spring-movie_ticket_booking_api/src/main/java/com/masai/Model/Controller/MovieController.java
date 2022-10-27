package com.masai.Model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Movie;
import com.masai.Service.MovieService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class MovieController {
	
	
	@Autowired
	private MovieService service;
	
	@GetMapping("/movie/{id}")
	public Movie getMovieById(@PathVariable("id") Integer id) {
		
		return service.viewMovie(id);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		
		return service.viewMovieList();
	}
	
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie) {
		
		return service.addMovie(movie);
	}
	
	@PutMapping("/movie")
	public Movie updateMovie(@RequestBody Movie movie) {
		
		return service.updateMovie(movie);
	}
	
	@DeleteMapping("/movie")
	public Movie deleteMovie(@RequestBody Movie movie) {
		
		return service.removeMovie(movie);
	}

}
