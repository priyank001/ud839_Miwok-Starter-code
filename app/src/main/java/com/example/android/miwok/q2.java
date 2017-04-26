package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q2 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        b1 = (Button)findViewById(R.id.op12);
        b2 = (Button)findViewById(R.id.op22);
        b3 = (Button)findViewById(R.id.op32);
        b4 = (Button)findViewById(R.id.op42);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","1");
                Intent intent = new Intent(q2.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q2.this,q3.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","1");
                Intent intent = new Intent(q2.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","1");
                Intent intent = new Intent(q2.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

}

