package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main14Activity extends AppCompatActivity {
      Button Wheat;
      Button Rice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Wheat=(Button)findViewById(R.id.wht);
        Rice=(Button)findViewById(R.id.ri);

        Wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main14Activity.this,Main17Activity.class);
                startActivity(intent);
            }
        });
        Rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main14Activity.this,Main18Activity.class);
                startActivity(intent);
            }
        });

    }
}
