package com.pasukapp.movielist.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pasukapp.movielist.R
import com.pasukapp.movielist.adapters.ActorAdapter
import com.pasukapp.movielist.databinding.ActivityMovieDetailsBinding
import com.pasukapp.movielist.helpers.MovieCreator
import com.pasukapp.movielist.models.Actor
import com.squareup.picasso.Picasso

class MovieDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailsBinding
    private lateinit var actorAdapter: ActorAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        showMovieDetails()
    }

    private fun showMovieDetails() {
        val movieModel = MovieCreator().createMovieModel()

        actorAdapter = ActorAdapter(movieModel.movieActors as MutableList<Actor>)
        binding.rvActorList?.adapter = actorAdapter
        binding.rvActorList?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        Picasso.get().load(movieModel.movieCover).into(binding.imgMovieCover)
        binding.ratingMovie?.rating = movieModel.movieRating.totalRating
        binding.txtMovieGenre?.text = movieModel.movieGenre
        binding.txtViewAgeRating?.text = movieModel.ageMovieRating
        binding.txtMovieReviews?.text =
            "${movieModel.movieRating.totalReviews.toString()} ${resources.getString(R.string.txt_reviews_source)}"
        binding.txtStoryline?.text = movieModel.movieStoryline


    }
}