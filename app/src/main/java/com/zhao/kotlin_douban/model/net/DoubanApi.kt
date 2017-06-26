package com.zhao.kotlin_douban.model.net

import com.zhao.kotlin_douban.entity.MovieDetail
import com.zhao.kotlin_douban.entity.MoviesResult
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable
import java.util.*

/**
 * Created by zhao on 2017/6/17.
 */
interface DoubanApi{
    @GET("movie/{type}")
    fun getMovieLists(@Path("type")type : String): Observable<MoviesResult>

    @GET("movie/subject/{itemId}")
    fun getMovieDetail(@Path("itemId")id : String): Observable<MovieDetail>
}