package com.zeroheat.foodshopapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeroheat.foodshopapp.R
import com.zeroheat.foodshopapp.adapters.PizzaAdapter
import com.zeroheat.foodshopapp.datas.PizzaData
import kotlinx.android.synthetic.main.fragment_pizza.*


class PizzaFragment : Fragment() {

    private lateinit var mAdapter: PizzaAdapter
    private val mPizzaList = ArrayList<PizzaData>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            : View? {
        return inflater.inflate(R.layout.fragment_pizza, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mPizzaList.add(
            PizzaData(
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg",
                "피자헛",
                "2"
            )
        )
        mPizzaList.add(
            PizzaData(
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800",
                "파파존스",
                "3"
            )
        )
        mPizzaList.add(
            PizzaData(
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png",
                "도미노피자",
                "3"
            )
        )
        mPizzaList.add(
            PizzaData(
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200",
                "미스터피자",
                "3"
            )
        )

        mAdapter = PizzaAdapter(requireContext(), R.layout.pizza_list_item, mPizzaList)

        pizzaListView.adapter = mAdapter



    }

}