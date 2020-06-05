package com.lopes.contactList

import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lopes.contactList.model.Contact

class ContactViewHolder RecyclerView.ViewHolder(view)  {

    private val textViewName = view.findViewById<TextView>(R.id.textViewName)
    private val textViewEmail = view.findViewById<TextView>(R.id.textViewEmail)
    private val textViewPhone = view.findViewById<TextView>(R.id.textViewPhone)

    fun bind(item: Contact) {

        textViewName.text = item.name
        textViewEmail.text = item.email
        textViewPhone.text = item.phone

    }
}