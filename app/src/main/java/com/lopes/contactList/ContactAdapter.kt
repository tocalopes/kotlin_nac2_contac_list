package com.lopes.contactList

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lopes.contactList.model.Contact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter  RecyclerView.Adapter<ContactViewHolder>() {
    private val items = mutableListOf<Tarefa>()

    fun insertContac(newContact: Contact){
        items.add(newContact)

        //Notifica a lista que tem novos items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}