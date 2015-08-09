package com.serahaeyum.imarkettest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

    public class DBManager extends SQLiteOpenHelper {

        public DBManager(Context context, String name, CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE USER_LIST( _id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, passwd TEXT, email TEXT, ideacnt INTEGER, coin INTEGER)");
        }

        @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}