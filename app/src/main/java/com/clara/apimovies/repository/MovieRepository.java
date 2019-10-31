package com.clara.apimovies.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.clara.apimovies.model.Movie;
import com.clara.apimovies.service.AuthorizationHeaderInterceptor;
import com.clara.apimovies.service.MovieService;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MovieRepository {

    private static final String TAG = "MOVIE_REPOSITORY";

    private MovieService mMovieService;
    private final String baseURL = "https://movies-2417.herokuapp.com/api/";
    private MutableLiveData<List<Movie>> mAllMovies;

    public MovieRepository() {

        // TODO create client with interceptor to set header on each request

        // TODO create and configure Retrofit instance

        // TODO initialize allMovies
    }

    public MutableLiveData<List<Movie>> getAllMovies() {

       return null;  // TODO finish this method, replace with your code

    }


    public MutableLiveData<Movie> getMovie(final int id) {

        /* Fetch one movie by it's ID. The value is available by observing the
        MutableLiveData object returned from this method.

        This method isn't used in the app, but fetching an item by ID is
        a very common task so I added it anyway, as an example. */

        final MutableLiveData<Movie> movie = new MutableLiveData<>();

        mMovieService.get(id).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "fetched movie " + response.body());
                    movie.setValue(response.body());
                } else {
                    Log.e(TAG, "Error getting movie id " + id + " because " + response.message());
                    movie.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.e(TAG, "Error getting movie id " + id , t);
            }
        });

        return movie;
    }

    public MutableLiveData<String> insert(final Movie movie) {

        // TODO
        return null;  // replace with your code

    }


    public void update(final Movie movie) {

        // TODO

    }


    public void delete(final Movie movie) {

        // TODO

    }

}
