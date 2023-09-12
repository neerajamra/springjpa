package com.example.springjpa.Repository;

import com.example.springjpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

//  MovieRepository and JPA both are the interface that's why we extends

public interface MovieRepository extends JpaRepository<Movie,String> {

}
