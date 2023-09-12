package com.example.springjpa.Controller;

import com.example.springjpa.Model.Movie;
import com.example.springjpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// This is use for rest api
@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get_movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();

    }

    @PostMapping("/add_movie")

    public void addMovie(@RequestBody() Movie movie){
        movieService.addMovie(movie);
    }


}
