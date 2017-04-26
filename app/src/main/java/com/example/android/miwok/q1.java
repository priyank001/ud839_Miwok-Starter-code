package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q1 extends AppCompatActivity {
    Button b1 ,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);
        b1 = (Button)findViewById(R.id.op11);
        b2 = (Button)findViewById(R.id.op21);
        b3 = (Button)findViewById(R.id.op31);
        b4 = (Button)findViewById(R.id.op41);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b=new Bundle();
                b.putString("Score","0");

                Intent intent = new Intent(q1.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q1.this,q2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","0");

                Intent intent = new Intent(q1.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b=new Bundle();
                b.putString("Score","0");

                Intent intent = new Intent(q1.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
