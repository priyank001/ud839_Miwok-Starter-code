package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q3 extends AppCompatActivity {

        Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        b1 = (Button)findViewById(R.id.op13);
        b2 = (Button)findViewById(R.id.op23);
        b3 = (Button)findViewById(R.id.op33);
        b4 = (Button)findViewById(R.id.op43);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","2");
                Intent intent = new Intent(q3.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q3.this,q4.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","2");
                Intent intent = new Intent(q3.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Score","2");
                Intent intent = new Intent(q3.this,last.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
