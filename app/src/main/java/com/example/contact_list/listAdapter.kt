package com.example.contact_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class  ContactRvAdapter(private val contactList: List<Contact>) :
    RecyclerView.Adapter<ContactRvAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_items, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        holder.itemView.findViewById<ImageView>(R.id.ivPersonal).setImageResource(contact.imageResId)
        holder.itemView.findViewById<TextView>(R.id.tvName).text = contact.name
        holder.itemView.findViewById<TextView>(R.id.tvEmail).text = contact.email
        holder.itemView.findViewById<TextView>(R.id.tvPhoneNumber).text = contact.phoneNumber
    }
    override fun getItemCount(): Int{
        return contactList.size
    }
}
