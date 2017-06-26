package com.zhao.kotlin_douban.ui.activity

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.content_movie_brief.*

import com.zhao.kotlin_douban.R
import com.zhao.kotlin_douban.entity.MovieDetail
import com.zhao.kotlin_douban.model.net.NetworkClient
import kotlinx.android.synthetic.main.content_movie_brief.*
import kotlinx.android.synthetic.main.item_movie.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        initData();
    }

    fun initData(){
        NetworkClient.doubanApi.getMovieDetail("11803087")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { detail -> showDetailUI(detail)}
                )
    }

    fun showDetailUI(detail : MovieDetail){
        tv_sub_title.text = detail.title
        tv_rating.text = detail.rating.average.toString()
        tv_sub_oldname.text = detail.original_title?:""
        tv_summary.text = detail.summary
        tv_person.text = detail.ratings_count.toString()
        Glide.with(this).load(detail.images.large).into(head_image)
    }
}
