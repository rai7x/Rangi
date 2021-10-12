package com.example.rangi;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import android.content.Context;
import android.content.ContentValues;
import android.graphics.Color;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String TABLE_NAME = "TABLE_NAME";
    public static final String COLUMN_ZERO_RGB = "column_one_RGB";
    public static final String COLUMN_ONE_NAME = "column_two_Name";


    public DatabaseHelper(@Nullable Context context){ //}, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "IWetMyPlants_SQLite_DataBase.db", null, 1);

    }

    // this is called the first time a database is accessed. The code here should create a new database
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_Table_SQL_Statement= "CREATE TABLE "
                + TABLE_NAME + " ("
                + COLUMN_ZERO_RGB + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_ONE_NAME + " TEXT)";

        sqLiteDatabase.execSQL(create_Table_SQL_Statement);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //Replace old SQLite database with new SQLite database
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    public long add_entry_to_DB (Color col) {

        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();
    }

}