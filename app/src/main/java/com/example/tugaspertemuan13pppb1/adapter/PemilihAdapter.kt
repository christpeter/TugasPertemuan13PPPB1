package com.example.tugaspertemuan13pppb1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaspertemuan13pppb1.DataPemilih
import com.example.tugaspertemuan13pppb1.R

class PemilihAdapter(
    private var dataList: List<DataPemilih>,
    private val onEdit: (DataPemilih) -> Unit,
    private val onDelete: (DataPemilih) -> Unit,
    private val onDetail: (DataPemilih) -> Unit
) : RecyclerView.Adapter<PemilihAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama: TextView = itemView.findViewById(R.id.tvNama)
        val btnEdit: ImageButton = itemView.findViewById(R.id.btnEdit)
        val btnDelete: ImageButton = itemView.findViewById(R.id.btnDelete)
        val btnDetail: ImageButton = itemView.findViewById(R.id.btnDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pemilih, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pemilih = dataList[position]
        holder.tvNama.text = pemilih.nama

        holder.btnEdit.setOnClickListener { onEdit(pemilih) }
        holder.btnDelete.setOnClickListener { onDelete(pemilih) }
        holder.btnDetail.setOnClickListener { onDetail(pemilih) }
    }

    override fun getItemCount() = dataList.size

    fun updateData(newDataList: List<DataPemilih>) {
        dataList = newDataList
        notifyDataSetChanged()
    }
}