package com.lopes.contactList

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.lopes.contactList.database.ContactsDatabase
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var editTextContact: EditText
    lateinit var buttonAdd: Button
    lateinit var recyclerView: RecyclerView

    lateinit var database: ContactsDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextContact = findViewById(R.id.editTextContact)
        buttonAdd = findViewById(R.id.buttonAdd)
        recyclerView = findViewById<View>(R.id.recyclerView)

        database = ContactsDatabase(this)


        val contactAdapter = ContactAdpter()

    }
}