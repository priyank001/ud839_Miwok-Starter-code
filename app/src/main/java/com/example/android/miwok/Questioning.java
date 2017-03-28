package com.example.android.miwok;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Questioning extends AppCompatActivity {

    int i = 0, status = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questioning);
        TextView myTextView, myTextView1,myTextView3, myTextView4;
        Button button = (Button) findViewById(R.id.button1);
        ;

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("currentPosition");
            }
            if (newString == null) {
                do {
                    switch (i) {

                        case 0:
                            myTextView = (TextView) findViewById(R.id.firstone);
                            myTextView.setText("Hello World!");
                            myTextView1 = (TextView) findViewById(R.id.secondone);
                            myTextView1.setText("Hello World!");

                            button.setOnClickListener(new Button.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (status == 0)
                                        i++;
                                }
                            });
                            break;

                        case 1: {
                            myTextView3 = (TextView) findViewById(R.id.firstone);
                            myTextView3.setVisibility(View.INVISIBLE);
                            myTextView4 = (TextView) findViewById(R.id.secondone);
                            myTextView4.setVisibility(View.INVISIBLE);
                            myTextView = (TextView) findViewById(R.id.visibleOne);
                            myTextView.setVisibility(View.VISIBLE);
                            myTextView.setText("2nd time ");
                            myTextView1 = (TextView) findViewById(R.id.visibleTwo);
                            myTextView1.setVisibility(View.VISIBLE);
                            myTextView1.setText("Hello World!");
                            button.setOnClickListener(new Button.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (status == 0)
                                        i++;
                                }
                            });
                        }
                        break;
                        default: {

                            String label = new String("End Lesson");
                            button.setText(label);
                            button.setOnClickListener(new Button.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (status == 0)
                                        status = 1;
                                    i = 0;
                                }
                            });

                        }
                    }
                }while(status == 0);
            }
            if (newString == "2") {

            }
            if (newString == "3") {

            }
            if (newString == "4") {

            }
            if (newString == "5") {

            }
            if (newString == "6") {

            }
            if (newString == "7") {

            }
            if (newString == "8") {

            }
            if (newString == "9") {

            }
            if (newString == "0") {

            }

        } else {
            newString = (String) savedInstanceState.getSerializable("currentPosition");
        }
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 0)
                    i++;
                else {


                }
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Questioning Page")

                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
