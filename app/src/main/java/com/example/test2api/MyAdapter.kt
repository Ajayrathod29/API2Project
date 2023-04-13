package com.example.test2api

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Activity, private val productList: List<User>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.eachname,parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.userFirstName.text = currentItem.firstName
        holder.userMiddleName.text = currentItem.maidenName
        holder.userLastNAme.text = currentItem.lastName
        holder.userGender.text = currentItem.gender
        holder.userPhone.text = currentItem.phone



    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userFirstName : TextView
        var userMiddleName : TextView
        var userLastNAme : TextView
        var userGender : TextView
        var userPhone : TextView


        init {
            userFirstName = itemView.findViewById(R.id.textView)
            userMiddleName = itemView.findViewById(R.id.textView2)
            userLastNAme = itemView.findViewById(R.id.textView3)
            userGender = itemView.findViewById(R.id.textView4)
            userPhone = itemView.findViewById(R.id.textView5)


        }


    }
}