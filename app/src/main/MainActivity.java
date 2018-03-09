package com.example.mypc.farmerbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"on Create: Starting");
        Button btnnavtovegetables = (Button) findViewById(R.id.vegetables);
        btnnavtovegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnNavtovegetables");
                Intent intent= new Intent(MainActivity.this,vegetables.class);
                startActivity(intent);
                Intent intent1= new Intent(MainActivity.this,grains.class);
                startActivity(intent1);
                Intent intent2= new Intent(MainActivity.this,fruits.class);
                startActivity(intent2);
            }
        });
    }

}
