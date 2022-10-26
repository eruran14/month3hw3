package com.eru.month3hw3

import androidx.viewpager2.widget.ViewPager2
import com.eru.base.BaseActivity
import com.eru.month3hw3.databinding.ActivityMainBinding
import com.eru.month3hw3.pager.FirstPageFragment
import com.eru.month3hw3.pager.PagerAdapter
import com.eru.month3hw3.pager.SecondPageFragment
import com.eru.month3hw3.pager.ThirdPageFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var adapter: PagerAdapter

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        super.initViews()

        adapter = PagerAdapter(supportFragmentManager, lifecycle)
        adapter.addFragment(FirstPageFragment())
        adapter.addFragment(SecondPageFragment())
        adapter.addFragment(ThirdPageFragment())

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager.adapter = adapter
    }
}