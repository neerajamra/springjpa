package com.example.springjpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@ Entity annotation will create a table of Movie in dataBase
@Entity
public class Movie {

    // @Id Annotation is use for primary key
    @Id

    // @Column Annotation is use for change the name of columnName

    @Column(name = "movie_name")
    private String name;
    // @Column Annotation is use for change the name of columnName
    // but in java application variable name will be duration
    @Column(name = "movie_duration")
    private int duration;

    private double rating;
    // default constructor for postman because postman make object by calling default constructor
    //when we send movie as request
    public Movie(){

    }

    // Constructor



    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
