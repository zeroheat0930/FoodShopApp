package com.zeroheat.foodshopapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zeroheat.foodshopapp.fragments.PizzaFragment
import com.zeroheat.foodshopapp.fragments.SettingFragment


class MainViewPagerAdapter (fm:FragmentManager) : FragmentPagerAdapter (fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return  when (position){

            0 -> "피자주문"
            else -> "내 정보 설정"
//           0 -> "이름"
//            1 -> "출생년도"
//            2 -> "인사말"
//            3 -> "기타1"
//            else -> "기타2"

        }
    }


    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when (position){
            0 -> {
                PizzaFragment()
            }
            else -> SettingFragment()
        }


//        return when (position){
//            0 -> {
//                NameFragment()
//            }
//            1 -> {
//                BirthYearFragment()
//            }
//            2 -> {
//                HelloFragment()
//            }
//            3 -> {
//                Etc1Fragment()
//            }
//            else -> Etc2Fragment()
    }


}