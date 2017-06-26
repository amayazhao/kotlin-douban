package com.zhao.kotlin_douban.entity

/**
 * Created by zhao on 2017/6/17.
 */
data class MoviesResult(var start:Int, var count : Int, var total: Int, var subjects : List<Movie>) {
}