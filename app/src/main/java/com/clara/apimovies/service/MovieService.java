package com.clara.apimovies.service;

import com.clara.apimovies.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MovieService {

    // TODO get all movies


    // Example - get movie by ID
    @GET("movies/{id}/")
    Call<Movie> get(@Path("id") int id);


    // TODO POST insert movie


    // TODO PATCH update movie


    // TODO DELETE delete movie

}
