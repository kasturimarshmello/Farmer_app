package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public Button vegetables;
   public Button grains;
   public Button fruits;
   public Button remain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vegetables=(Button)findViewById(R.id.Vegetables);
        grains=(Button)findViewById(R.id.Grains);
        fruits=(Button)findViewById(R.id.Fruits);
        remain=(Button)findViewById(R.id.Remain);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);

            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main13Activity.class);
                startActivity(intent);
            }
        });
        grains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main14Activity.class);
                        startActivity(intent);
            }
        });
    }
}
