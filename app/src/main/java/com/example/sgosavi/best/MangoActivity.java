package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MangoActivity extends AppCompatActivity {
    EditText name;
    EditText price;
    String message;
    String message1;
    Button details;
    public final static String KEY = "com.example.sgosavi.best.key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mango);
        details=findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MangoActivity.this,DetailsActivity.class);
                startActivity(intent2);
            }
        });
    }
    public void send(View view) {
        name = findViewById(R.id.nameatmangoes);
        message = name.getText().toString();
        Intent intent = new Intent(MangoActivity.this, Main15Activity.class);
        intent.putExtra(KEY, message);
        startActivity(intent);

        price = findViewById(R.id.raters);
        message1 = price.getText().toString();
        Intent intent1 = new Intent(MangoActivity.this, Main15Activity.class);
        intent1.putExtra(KEY, message1);
        startActivity(intent1);
    }
}
