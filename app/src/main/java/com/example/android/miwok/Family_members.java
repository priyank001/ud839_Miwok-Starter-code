package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Family_members extends AppCompatActivity {
    ArrayList<Questions> listItem;
    static int i = 0;
    static int l = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        listItem = new ArrayList<Questions>();
        listItem.add(new Questions("I had asked him to get me three kilos __ sugar.", "off", "of", "both are incorrect", "of"));
        listItem.add(new Questions("Please switch __ the light when you leave the room.", "of", "both", "off", "off"));
        listItem.add(new Questions("Can you take care __ my son till I use the washroom.", "off", "of", "both are incorrect", "of"));
        listItem.add(new Questions("Please Rinse __ your dirty cloths with clean water.", "of", "off", "both", "off"));
        Questions ques3 = listItem.get(i);
        TextView textView = (TextView) findViewById(R.id.ques);
        RadioButton rb1 = (RadioButton) findViewById((R.id.radioButton));
        RadioButton rb2 = (RadioButton) findViewById((R.id.radioButton2));
        RadioButton rb3 = (RadioButton) findViewById((R.id.radioButton3));
        Button b1 = (Button) findViewById(R.id.button);
        textView.setText(ques3.getquestion());
        rb1.setText(ques3.getoption1());
        rb2.setText(ques3.getoption2());
        rb3.setText(ques3.getoption3());
        Questions.result++;
    }
}