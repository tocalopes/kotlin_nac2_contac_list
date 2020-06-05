package com.lopes.contactList.database;

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns


object FeedReaderContract {
        // Table contents are grouped together in an anonymous object.
        object FeedEntry : BaseColumns {
        const val TABLE_NAME = "contacts"
        //const val COLUMN_NAME_ID= "name_id";
        const val COLUMN_NAME_NAME = "name";
        const val COLUMN_NAME_EMAIL = "email";
        const val COLUMN_NAME_PHONE = "phone";
        }
}
private const val SQL_CREATE =
        """CREATE TABLE ${FeedReaderContract.FeedEntry.TABLE_NAME} ( 
                        ${BaseColumns._ID} INTEGER PRIMARY KEY,
                        ${FeedReaderContract.FeedEntry.COLUMN_NAME_NAME} TEXT,
                        ${FeedReaderContract.FeedEntry.COLUMN_NAME_EMAIL} TEXT,
                        ${FeedReaderContract.FeedEntry.COLUMN_NAME_PHONE} TEXT)
                """;

private const val SQL_DROP = "DROP TABLE IF EXISTS + ${FeedReaderContract.FeedEntry.TABLE_NAME}";

class ContactDbHelper (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

        override  fun onCreate(db : SQLiteDatabase){
                db.execSQL(SQL_CREATE);
        }

        override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
                TODO("Not yet implemented")
                db.execSQL(SQL_DROP);
                onCreate(db);
        }

        qoverride fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
                onUpgrade(db, oldVersion, newVersion)
        }

        companion object {
                // If you change the database schema, you must increment the database version.
                const val DATABASE_VERSION = 1
                const val DATABASE_NAME = "FeedReader.db"
        }




}
