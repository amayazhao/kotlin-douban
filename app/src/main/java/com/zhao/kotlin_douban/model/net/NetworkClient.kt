package com.zhao.kotlin_douban.model.net

import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by zhao on 2017/6/17.
 */
class NetworkClient {
    companion object{
        val baseUrl : String = "http://api.douban.com/v2/";
        val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        val doubanApi : DoubanApi = retrofit.create(DoubanApi::class.java);
    }
}