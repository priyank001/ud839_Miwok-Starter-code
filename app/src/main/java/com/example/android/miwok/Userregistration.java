package com.example.android.miwok;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.miwok.data.RegDBHelper;
import com.example.android.miwok.data.RegLogin.RegEntry;
public class Userregistration extends AppCompatActivity {

    private EditText mNameEditText;
    /** EditText field to enter the username */

    private EditText mEmailEditText;
    /** EditText field to enter the user's e-mail */

    private EditText mPasswordEditText;
    /** EditText field to enter the user's password */

    boolean entry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userregistration);

        mNameEditText = (EditText) findViewById(R.id.edit_user_name);
        mEmailEditText = (EditText) findViewById(R.id.edit_email);
        mPasswordEditText = (EditText) findViewById(R.id.edit_password);
    }




    private void insertReg() {
        // Read from input fields
        // Use trim to eliminate leading or trailing white space
        String nameString = mNameEditText.getText().toString().trim();
        String emailString = mEmailEditText.getText().toString().trim();
        String passwordString = mPasswordEditText.getText().toString().trim();
        entry = true;

        // Create database helper
        RegDBHelper mDbHelper = new RegDBHelper(this);

        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and pet attributes from the editor are the values.
        ContentValues values = new ContentValues();
        values.put(RegEntry.COLUMN_USER_NAME, nameString);
        values.put(RegEntry.COLUMN_EMAIL, emailString);
        values.put(RegEntry.COLUMN_PASSWORD,passwordString);
        values.put(String.valueOf(RegEntry.COLUMN_HAS_ENTRY), entry);

        // Insert a new row for pet in the database, returning the ID of that new row.
        long newRowId = db.insert(RegEntry.TABLE_NAME, null, values);

        // Show a toast message depending on whether or not the insertion was successful
        if (newRowId == -1) {
            // If the row ID is -1, then there was an error with insertion.
            Toast.makeText(this, "Error with saving user details", Toast.LENGTH_SHORT).show();
        } else {
            // Otherwise, the insertion was successful and we can display a toast with the row ID.
            Toast.makeText(this, "User saved with row id: " + newRowId, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_editor.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Save" menu option
            case R.id.action_save:
                // Save pet to database
                insertReg();
                // Exit activity
                finish();
                return true;
            // Respond to a click on the "Delete" menu option
            case R.id.action_delete:
                // Do nothing for now
                return true;
            // Respond to a click on the "Up" arrow button in the app bar
            case android.R.id.home:
                // Navigate back to parent activity (CatalogActivity)
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}