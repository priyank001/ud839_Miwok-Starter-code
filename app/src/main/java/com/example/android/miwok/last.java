package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class last extends AppCompatActivity {


    TextView t;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        home=(Button)findViewById(R.id.home);
        t = (TextView)findViewById(R.id.result);
        Bundle b = getIntent().getExtras();
        String str = b.getString("Score");
        t.setText("You Score is: "+str);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(last.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
