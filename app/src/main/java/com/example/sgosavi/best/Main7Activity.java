package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
     Button Payment;
     Button getdetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        getdetails=findViewById(R.id.button23);
        getdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main7Activity.this,GetdetailsActivity.class);
                startActivity(intent);
            }
        });
        Payment=findViewById(R.id.Payment);
        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(Main7Activity.this,Main8Activity.class);
                startActivity(p);
            }
        });

    }


    }

