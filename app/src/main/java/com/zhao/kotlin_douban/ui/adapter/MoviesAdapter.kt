package com.zhao.kotlin_douban.ui.adapter

import android.content.Context
import android.content.DialogInterface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.bumptech.glide.Glide
import com.zhao.kotlin_douban.R
import com.zhao.kotlin_douban.entity.Movie
import kotlinx.android.synthetic.main.item_movie.view.*
/**
 * Created by zhao on 2017/6/14.
 */
class MoviesAdapter constructor(var context: Context, var lists:MutableList<Movie>, val userClick : (Movie) -> Unit): RecyclerView.Adapter<MoviesAdapter.MoviesHolder>() {
    init {
    }
    override fun onBindViewHolder(holder: MoviesHolder?, position: Int) {
        val movie = lists?.get(position)
        holder?.bindMovies(movie)
    }

    override fun onCreateViewHolder(group: ViewGroup?, p1: Int): MoviesHolder
            = MoviesHolder(LayoutInflater.from(context).inflate(R.layout.item_movie,group,false),userClick)

    override fun getItemCount(): Int = lists.size

    fun addNewItem( n : List<Movie>){
        lists.addAll(n)
        notifyDataSetChanged()
    }
    inner class MoviesHolder(var viewItem : View, val userClick : (Movie) -> Unit):RecyclerView.ViewHolder(viewItem){
        fun bindMovies(movie : Movie) {
            with(movie){
                Glide.with(context).load(movie?.images?.medium).placeholder(R.drawable.ic_menu_send).into(viewItem.image)
                viewItem.tv_title.text = movie?.title
                viewItem.tv_direct.text = "导演：" + movie?.directors?.get(0)?.name
                viewItem.tv_actor.text = "主演：" + movie?.casts?.get(0)?.name
                viewItem.tv_see.text = movie?.collect_count.toString() + "人看过"
                var rating = movie?.rating?.average?:0f
                if(rating > 0){
                    viewItem.ratingBar.rating = rating/2
                }
                viewItem.setOnClickListener { userClick(movie) }
            }
        }
    }
}