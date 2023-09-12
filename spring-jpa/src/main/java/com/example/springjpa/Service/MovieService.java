package com.example.springjpa.Service;

import com.example.springjpa.Model.Movie;
import com.example.springjpa.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // this have already @Component
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public List<Movie> getAllMovies(){

        // this will use for find all movie from database
        // movie repository extend JPA and in jpa all method are available
        // ex findAll(),find()
        // JPA replace the sql query if we use this then execute query will return type of
        // resultSet and convert into list this is so messy
        //that why we use findAll() from JPA
       return movieRepository.findAll();

    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);

    }
}
