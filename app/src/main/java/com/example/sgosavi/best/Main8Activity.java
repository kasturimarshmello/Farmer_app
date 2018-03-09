package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main8Activity extends AppCompatActivity {
    Button getBtn;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btn=findViewById(R.id.button24);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main8Activity.this,Main9Activity.class);
                startActivity(intent);
            }
        });
        getBtn=findViewById(R.id.button25);
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main8Activity.this,Main9Activity.class);
                startActivity(intent);
            }
        });


    }


    }

