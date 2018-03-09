package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {
     EditText Name;
     EditText Email;
     EditText Message;
     RatingBar ratingBar;
     TextView value;
     Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Name=(EditText)findViewById(R.id.contact);
        Email=(EditText)findViewById(R.id.raters);
        Message=(EditText)findViewById(R.id.editText7);
        Message=(EditText)findViewById(R.id.add);
        btn=(Button)findViewById(R.id.button5);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        value=(TextView)findViewById(R.id.textView6);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value.setText("Value:"+rating);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feed=new Intent(Main9Activity.this, Main10Activity.class);
                startActivity(feed);

            }
        });
    }
}
