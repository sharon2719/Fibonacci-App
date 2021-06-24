package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRVAdapter ( var numList:List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
      var itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_of_numbers,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNum.text=numList.get(position).toString()


    }

    override fun getItemCount(): Int {
       return numList.size
    }
}
class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNum=itemView.findViewById<TextView>(R.id.tvNumbers)
}
