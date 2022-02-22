package com.zeroheat.foodshopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.foodshopapp.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupEvents()
        setValue()



    }



    private fun setupEvents() {
    }

    private fun setValue() {




        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter
        mainViewPager.offscreenPageLimit = 2
        mainTabLayout.setupWithViewPager(mainViewPager)

    }





}