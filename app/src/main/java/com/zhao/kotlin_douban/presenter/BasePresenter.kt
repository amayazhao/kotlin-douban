package com.zhao.kotlin_douban.presenter

import rx.Subscription
import rx.subscriptions.CompositeSubscription

/**
 * Created by zhao on 2017/6/14.
 */
abstract class BasePresenter {
    var mSubscriptions : CompositeSubscription? = null;
    init {
        mSubscriptions = CompositeSubscription();
    }

    fun registerSub(sub:Subscription){
        mSubscriptions?.add(sub);
    }

    fun unRegisterSub(){
        mSubscriptions?.unsubscribe();
    }
}