package com.example.android.miwok.data;

/**
 * Created by Priyank on 13-04-2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.miwok.data.RegLogin.RegEntry;

public class RegDBHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = RegDBHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "login.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link RegDBHelper}.
     *
     * @param context of the app
     */
    public RegDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_REG_TABLE =  "CREATE TABLE " + RegEntry.TABLE_NAME + " ("
                + RegEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RegEntry.COLUMN_USER_NAME + " TEXT NOT NULL, "
                + RegEntry.COLUMN_EMAIL + " TEXT, "
                + RegEntry.COLUMN_PASSWORD + " TEXT NOT NULL, "
                + RegEntry.COLUMN_HAS_ENTRY + " BOOLEAN DEFAULT FALSE);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_REG_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}
