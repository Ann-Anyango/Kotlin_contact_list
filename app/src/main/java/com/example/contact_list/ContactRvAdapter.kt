package com.example.contact_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.databinding.ContactListItemsBinding
import com.squareup.picasso.Picasso

class ContactAdapter(var ContactList:List<Contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ContactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var currentContact = ContactList.get(position)
        var binding = holder.binding
        binding.ivImage.tag=currentContact.image
        binding.tvName.text = currentContact.name
        binding.tvPhoneNumber.text = currentContact.phoneNumber
        binding.tvEmail.text = currentContact.email

        Picasso
            .get()
            .load(currentContact.image)
            .resize(280, 280)
            .centerCrop()
            .into(binding.ivImage)
    }







    class ContactViewHolder(var binding: ContactListItemsBinding) : RecyclerView.ViewHolder(binding.root)
}





//
//class  ContactAdapter(private val contactList: List<Contact>) :
//    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
//    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.contact_list_items, parent, false)
//        return ViewHolder(view)
//    }
//    override fun onBindViewHolder(binding: ViewHolder, position: Int) {
//        val contact = contactList[position]
//        binding.itemView.findViewById<ImageView>(R.id.ivPersonal)
//        binding.itemView.findViewById<TextView>(R.id.tvName).text = contact.name
//        binding.itemView.findViewById<TextView>(R.id.tvEmail).text = contact.email
//        binding.itemView.findViewById<TextView>(R.id.tvPhoneNumber).text = contact.phoneNumber
//        Picasso
//            .get()
//            .load(contact.image)
//            .resize(280, 280)
//           .centerCrop()
//            .into(binding.itemView)
//    }
//    override fun getItemCount(): Int{
//        return contactList.size
//    }
//
//}
//class ContactViewHolder(var binding:contact) : ContactAdapter.ViewHolder(binding.root)

