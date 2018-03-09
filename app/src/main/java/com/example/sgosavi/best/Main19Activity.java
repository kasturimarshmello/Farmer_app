package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main19Activity extends AppCompatActivity {
    EditText name;
    EditText price;
    String message;
    String message1;
    public Button details;
    public final static String KEY = "com.example.sgosavi.best.key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        details=findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main19Activity.this,DetailsActivity.class);
                startActivity(intent2);
            }
        });
    }
    public void send(View view) {
        name = findViewById(R.id.nameviewattomatoes);
        message = name.getText().toString();
        Intent intent = new Intent(Main19Activity.this, Main18Activity.class);
        intent.putExtra(KEY, message);
        startActivity(intent);

        price = findViewById(R.id.rate1);
        message1 = price.getText().toString();
        Intent intent1 = new Intent(Main19Activity.this, Main18Activity.class);
        intent1.putExtra(KEY, message1);
        startActivity(intent1);
    }

}
