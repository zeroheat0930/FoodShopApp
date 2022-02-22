package com.zeroheat.foodshopapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.zeroheat.foodshopapp.R
import com.zeroheat.foodshopapp.datas.PizzaData

class PizzaAdapter (
    val mContext: Context, val resId: Int, val mList: ArrayList<PizzaData>
):ArrayAdapter<PizzaData>(mContext,resId,mList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.pizza_list_item, null)
        }


        val row = tempRow!!


        val data = mList[position]

        val img = row.findViewById<ImageView>(R.id.imgPizza)
        val txt = row.findViewById<TextView>(R.id.txtPizza)
        val ratingBar = row.findViewById<TextView>(R.id.txt)


        txt.text = data.name
        ratingBar.text = data.star
        Glide.with(mContext).load(data.pic).into(img)

        return  row
    }

}