package com.example.android.miwok.data;

/**
 * Created by Priyank on 13-04-2017.
 */
import android.provider.BaseColumns;

public class RegLogin {
    private RegLogin() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class RegEntry implements BaseColumns {

        /** Name of database table for Registration */
        public final static String TABLE_NAME = "Login";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_USER_NAME ="name";

        public final static String COLUMN_EMAIL = "email";


        public final static String COLUMN_PASSWORD = "password";


        public final static boolean COLUMN_HAS_ENTRY = false;



    }

}



