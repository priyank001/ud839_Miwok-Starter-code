package com.example.android.miwok;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {
    String[] Elesson_names, Hlesson_names;
    ArrayList<Word> listItem;
    ListView mylistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        listItem = new ArrayList<Word>();

        Elesson_names = getResources().getStringArray(R.array.Elesson_names);
        Hlesson_names = getResources().getStringArray(R.array.Hlesson_names);
        int i = 0;

        while (i < Elesson_names.length) {
            Word word = new Word(Elesson_names[i], Hlesson_names[i]);
            listItem.add(word);
            i++;
        }

        mylistView = (ListView) findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this, listItem);
        mylistView.setAdapter(adapter);
        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /**
             * Callback method to be invoked when an item in this AdapterView has
             * been clicked.
             * <p>
             * Implementers can call getItemAtPosition(position) if they need
             * to access the data associated with the selected item.
             *
             * @param parent   The AdapterView where the click happened.
             * @param view     The view within the AdapterView that was clicked (this
             *                 will be a view provided by the adapter)
             * @param position The position of the view in the adapter.
             * @param id       The row id of the item that was clicked.
             */
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Elesson_name = listItem.get(position).getEnglishWord();
                Toast.makeText(getApplicationContext(),  " " + Elesson_name, Toast.LENGTH_SHORT).show();
                if(position == 0)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,0);
                }
                if(position == 1)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,1);
                }
                if(position == 2)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,2);
                }
                if(position == 3)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,3);
                }
                if(position == 4)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,4);
                }
                if(position == 5)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,5);
                }
                if(position == 6)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,6);
                }
                if(position == 7)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,7);
                }
                if(position == 8)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,8);
                }
                if(position == 9)
                {
                    Intent myIntent = new Intent(view.getContext(),Lesson_content.class);
                    startActivityForResult(myIntent,9);
                }
            }
        } );
    }
}
