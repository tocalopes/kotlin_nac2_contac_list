package com.lopes.contactList.database
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import com.lopes.contactList.model.Contact


class ContactsDatabase (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override  fun onCreate(db : SQLiteDatabase){
        db.execSQL(SQL_CREATE);
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
        db.execSQL(SQL_DROP);
        onCreate(db);
    }

    /*override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
            onUpgrade(db, oldVersion, newVersion)
    }*/

    companion object {
        // If you change the database schema, you must increment the database version.
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "ContactsList.db"
        const val TABLE_NAME = "contacts"
        //const val COLUMN_NAME_ID= "name_id";
        const val COLUMN_NAME_NAME = "name";
        const val COLUMN_NAME_EMAIL = "email";
        const val COLUMN_NAME_PHONE = "phone";
        const val SQL_CREATE =
            """CREATE TABLE $TABLE_NAME ( 
                        _ID INTEGER PRIMARY KEY,
                        $COLUMN_NAME_NAME TEXT,
                        $COLUMN_NAME_EMAIL TEXT,
                        $COLUMN_NAME_PHONE TEXT)
                """;

        const val SQL_DROP = "DROP TABLE IF EXISTS $TABLE_NAME";

    }



}
