package com.lopes.contactList.database

import android.content.ContentValues
import android.provider.BaseColumns
import com.lopes.contactList.model.Contact
import com.lopes.contactList.database.ContactsDatabase

fun getAllContacts(): List<Contact>{

    val sql = "SELECT * FROM ${ContactsDatabase.TABLE_NAME}".trimIndent()
    val cursor  = this.readableDatabase.rawQuery(sql, null)

    val results = mutableListOf<Contact>()

    while (cursor.moveToNext()){

        val idContact = cursor.getInt(cursor.getColumnIndex(BaseColumns._ID))
        val name = cursor.getString(cursor.getColumnIndex(ContactsDatabase.COLUMN_NAME_NAME))
        val email = cursor.getString(cursor.getColumnIndex(ContactsDatabase.COLUMN_NAME_EMAIL))
        val phone = cursor.getString(cursor.getColumnIndex(ContactsDatabase.COLUMN_NAME_PHONE))

        val contact = Contact(
            name, email, phone
        );

        results.add(contact)

    }

    cursor.close()

    return results

}
fun insertContact(item: Contact) : Long {
    return this.writableDatabase.insert("${ContactsDatabase.TABLE_NAME}", null,
        ContentValues().apply {
            put(ContactsDatabase.COLUMN_NAME_NAME, item.name)
            put(ContactsDatabase.COLUMN_NAME_EMAIL, item.email)
            put(ContactsDatabase.COLUMN_NAME_PHONE, item.phone)
        });
}