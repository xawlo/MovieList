package com.pasukapp.movielist.helpers

import com.pasukapp.movielist.R
import com.pasukapp.movielist.models.Actor
import com.pasukapp.movielist.models.MovieModel
import com.pasukapp.movielist.models.MovieRating

class MovieCreator {

    fun createMovieModel() = MovieModel(
        movieName = "Avengers: End Game",
        movieGenre = "Action, Adventure, Fantasy",
        ageMovieRating = "13+",
        movieCover = R.drawable.cover_temp,
        movieRating = MovieRating(totalReviews = 125, totalRating = 4f),
        movieStoryline = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
        movieActors = createActorList()

    )

    private fun createActorList(): MutableList<Actor> {
        val movieActorList: MutableList<Actor> = mutableListOf()
        movieActorList.add(Actor(name = "Robert Downey Jr.", actorImg = R.drawable.rdowneyjr_actor))
        movieActorList.add(Actor(name = "Chris Evans", actorImg = R.drawable.chrisevans_actor))
        movieActorList.add(Actor(name = "Mark Ruffalo", actorImg = R.drawable.mark_ruffalo_actor))
        movieActorList.add(
            Actor(
                name = "Chris Hemsworth",
                actorImg = R.drawable.chris_hemsworth_actor
            )
        )
        movieActorList.add(
            Actor(
                name = "Rocket Raccoon",
                actorImg = R.drawable.rocket_raccoon_actor
            )
        )
        return movieActorList
    }
}