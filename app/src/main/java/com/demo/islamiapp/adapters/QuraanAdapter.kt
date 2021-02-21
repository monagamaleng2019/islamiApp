package com.demo.islamiapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.demo.islamiapp.R
import com.demo.islamiapp.datamodels.Sura

class QuraanAdapter(val suraList: List<String>) :
    RecyclerView.Adapter<QuraanAdapter.QuraanViewHolder>() {

    class QuraanViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val suraName: TextView = view.findViewById(R.id.text_view_soura_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuraanViewHolder {
        val suraItemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_quraan, parent, false)
        return QuraanViewHolder(suraItemView)
    }

    override fun getItemCount(): Int {
        return suraList.size
    }

    override fun onBindViewHolder(itemHolder: QuraanViewHolder, position: Int) {
        val suraNameItem = suraList[position]
        itemHolder.suraName.text = suraNameItem
    }


}
