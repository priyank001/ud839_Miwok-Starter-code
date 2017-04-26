package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    String[] Elesson_names, Hlesson_names;
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b=new Bundle();
                b.putString("Lesson","1");

                Intent intent = new Intent(Numbers.this,levels.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b=new Bundle();
                b.putString("Lesson","2");

                Intent intent = new Intent(Numbers.this,levels2.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

}
