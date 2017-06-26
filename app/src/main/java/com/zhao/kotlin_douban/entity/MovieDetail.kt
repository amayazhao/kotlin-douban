package com.zhao.kotlin_douban.entity

/**
 * Created by zhao on 2017/6/20.
 */
data class MovieDetail(var id : String, var title : String, var original_title : String ,
                       var rating: Rating, var ratings_count : Int, var images : ImageBean,
                       var genres : Array<String>, var summary : String, var year : String,
                       var casts : Array<CastBean>, var directors : Array<CastBean>){

    var list : Array<Int>? = null;

    data class ImageBean(var small : String, var large : String, var medium : String)
    //movie person summary
    data class CastBean(var alt : String, var avatars : ImageBean,var name : String, var id : String)

}

