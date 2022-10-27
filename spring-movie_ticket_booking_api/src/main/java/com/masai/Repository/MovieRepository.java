package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
