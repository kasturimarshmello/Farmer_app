package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main12Activity extends AppCompatActivity {
    public final static String KEY = "com.example.sgosavi.best.key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Intent intent=getIntent();
        String message=intent.getStringExtra(KEY);
        TextView textView=new TextView(this);
        textView.setTextSize((float) 45d);
    }
}
