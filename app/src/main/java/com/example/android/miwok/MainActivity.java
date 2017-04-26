/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.example.android.miwok.data.RegLogin.RegEntry;
import com.example.android.miwok.data.RegDBHelper;

public class MainActivity extends AppCompatActivity {

    private RegDBHelper mDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Userregistration user = new Userregistration();
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
      //  if(user.entry == false ){
      //  Intent intent = new Intent(MainActivity.this, Userregistration.class);
      //  startActivity(intent);
      //}
        mDbHelper = new RegDBHelper(this);
       // displayDatabaseInfo();

        
        //Find the views that shows the all category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView family_members = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Animations
        // This is for first TextView
        AlphaAnimation animation1 = new AlphaAnimation(0.0f , 1.0f ) ;
        animation1.setFillAfter(true);
        animation1.setDuration(700);
        numbers.startAnimation(animation1);

        //This is for Second TextView
        AlphaAnimation animation2 = new AlphaAnimation(0.0f , 1.0f ) ;
        animation2.setFillAfter(true);
        animation2.setDuration(1800);
        family_members.startAnimation(animation2);

        //This is for Third TextView
        AlphaAnimation animation3 = new AlphaAnimation(0.0f , 1.0f ) ;
        animation3.setFillAfter(true);
        animation3.setDuration(2500);
        phrases.startAnimation(animation3);

        //This is for first TextView
        AlphaAnimation animation4 = new AlphaAnimation(0.0f , 1.0f ) ;
        animation4.setFillAfter(true);
        animation4.setDuration(2800);
        colors.startAnimation(animation4);

        try {
            //Set the clickListener on that view
            numbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Create a new Intent to open the {@link Numbers}
                    Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);

                    //Start the new activity
                    startActivity(numbersIntent);

                }
            });

            family_members.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Create a new Intent to open the {@link Numbers}
                    Intent familyIntent = new Intent(MainActivity.this, q1.class);

                    //Start the new activity
                    startActivity(familyIntent);

                }
            });

            colors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Create a new Intent to open the {@link Numbers}
                    Intent colorsIntent = new Intent(MainActivity.this, last.class);

                    //Start the new activity
                    startActivity(colorsIntent);

                }
            });

            phrases.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Create a new Intent to open the {@link Numbers}
                    Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);

                    //Start the new activity
                    startActivity(phrasesIntent);

                }
            });

        } catch (NullPointerException S) {
            Log.d("Error: ", " " + S);
        }
    }

/*
    private void displayDatabaseInfo() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                RegEntry._ID,
                RegEntry.COLUMN_USER_NAME,
                RegEntry.COLUMN_EMAIL
                };

        Cursor cursor = db.query(
                RegEntry.TABLE_NAME,   // The table to query
                projection,            // The columns to return
                null,                  // The columns for the WHERE clause
                null,                  // The values for the WHERE clause
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);                   // The sort order

        TextView displayView = (TextView) findViewById(R.id.LoginDet);

        try{
            displayView.setText("The Learner table contains " + cursor.getCount() + " entries.\n\n");
            displayView.append(RegEntry._ID + " - " +
                    RegEntry.COLUMN_USER_NAME + " - " +
                    RegEntry.COLUMN_EMAIL + " - " +
                    RegEntry.COLUMN_PASSWORD +"\n");

            int idColumnIndex = cursor.getColumnIndex(RegEntry._ID);
            int nameColumnIndex = cursor.getColumnIndex(RegEntry.COLUMN_USER_NAME);
            int breedColumnIndex = cursor.getColumnIndex(RegEntry.COLUMN_EMAIL);
            int genderColumnIndex = cursor.getColumnIndex(RegEntry.COLUMN_PASSWORD);

            // Iterate through all the returned rows in the cursor
            while (cursor.moveToNext()) {
                // Use that index to extract the String or Int value of the word
                // at the current row the cursor is on.
                int currentID = cursor.getInt(idColumnIndex);
                String currentName = cursor.getString(nameColumnIndex);
                String currentBreed = cursor.getString(breedColumnIndex);
                int currentGender = cursor.getInt(genderColumnIndex);
                // Display the values from each column of the current row in the cursor in the TextView
                displayView.append(("\n" + currentID + " - " +
                        currentName + " - " +
                        currentBreed + " - " +
                        currentGender));


        }
        }
       finally {
                // Always close the cursor when you're done reading from it. This releases all its
                // resources and makes it invalid.
                cursor.close();
            }

    }
*/

}

