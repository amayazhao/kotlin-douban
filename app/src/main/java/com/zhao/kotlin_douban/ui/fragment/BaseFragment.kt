package com.zhao.kotlin_douban.ui.fragment

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment

/**
 * Created by zhao on 2017/6/14.
 */

abstract class BaseFragment : Fragment(){
    var mActivity : Activity ? =null
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mActivity = context as Activity
    }
}