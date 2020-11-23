package com.pasukapp.movielist.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pasukapp.movielist.R
import com.pasukapp.movielist.models.Actor
import com.squareup.picasso.Picasso

class ActorAdapter(private val actorList: MutableList<Actor>) :
    RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemActorCardBinding = ItemActorCardBinding.inflate(LayoutInflater.from(parent.context))
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_actor_card, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(actorList[position])
    }

    override fun getItemCount() = actorList.size

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private var imgMovieActor = itemView.findViewById<ImageView>(R.id.img_actor)
        private var txtActorName = itemView.findViewById<TextView>(R.id.txt_actor_name)
        fun bind(actor: Actor) {
            Picasso.get().load(actor.actorImg).into(imgMovieActor)
            txtActorName.text = actor.name
        }

    }
}