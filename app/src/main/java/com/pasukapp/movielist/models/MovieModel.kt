package com.pasukapp.movielist.models

data class MovieModel(
    val movieName: String,
    val movieGenre: String,
    val ageMovieRating: String,
    val movieCover: Int,
    val movieRating: MovieRating,
    val movieStoryline: String,
    val movieActors: List<Actor>,
)

data class MovieRating(
    val totalReviews: Int,
    val totalRating: Float,
)

data class Actor(
    val name: String,
    val actorImg: Int,
)