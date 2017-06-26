package com.zhao.kotlin_douban.ui.fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout

import com.zhao.kotlin_douban.R
import com.zhao.kotlin_douban.entity.Movie
import com.zhao.kotlin_douban.model.net.NetworkClient
import com.zhao.kotlin_douban.ui.activity.MovieDetailActivity
import com.zhao.kotlin_douban.ui.adapter.MoviesAdapter
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_move_list.*
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class MoveListFragment : Fragment() {
    var mAdapter : MoviesAdapter?=null
    var listType : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_move_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAdapter = MoviesAdapter(context,ArrayList(),
                {
                    movie -> var detailIntent = Intent(context,MovieDetailActivity::class.java)
                    startActivity(detailIntent)
                })
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mRecyclerView.adapter = mAdapter
        loadMovies()
    }

    fun load(){
        Log.d("test","test")
        mAdapter?.addNewItem(testData())
    }

    fun loadMovies(){
        NetworkClient.doubanApi.getMovieLists("in_theaters")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {result ->
                            mAdapter?.addNewItem(result.subjects)
                            Log.d("test","test")
                        },
                        {error -> error.printStackTrace()})
    }

    fun testData() : List<Movie>{
        var m1 = Movie()
        m1.title = "test1"
        var m2 = Movie()
        m2.title = "test2"
        return listOf(m1,m2)
    }
}// Required empty public constructor
