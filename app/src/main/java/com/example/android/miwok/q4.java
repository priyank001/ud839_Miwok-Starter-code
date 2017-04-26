package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q4 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        b1 = (Button)findViewById(R.id.op14);
        b2 = (Button)findViewById(R.id.op24);
        b3 = (Button)findViewById(R.id.op34);
        b4 = (Button)findViewById(R.id.op44);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","3");
                Intent intent = new Intent(q4.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","4");
                Intent intent = new Intent(q4.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","3");
                Intent intent = new Intent(q4.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","3");
                Intent intent = new Intent(q4.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
