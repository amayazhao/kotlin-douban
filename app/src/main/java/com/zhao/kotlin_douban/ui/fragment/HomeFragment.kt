package com.zhao.kotlin_douban.ui.fragment

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zhao.kotlin_douban.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : BaseFragment() {
    var titles : Array<String> = arrayOf("正在上映","即将上映")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    fun initView(){
        tablayout.tabMode = TabLayout.MODE_FIXED
        viewpager.adapter = FragmentAdapter(fragmentManager)
        tablayout.setupWithViewPager(viewpager)
    }

    inner class FragmentAdapter constructor(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager){
        override fun getItem(p0: Int): Fragment {
            var fragment = MoveListFragment()
            return fragment
        }
        override fun getCount(): Int = 2;

        override fun getPageTitle(position: Int): CharSequence {
            return titles[position]
        }
    }
}
