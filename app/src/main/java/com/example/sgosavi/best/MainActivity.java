package com.example.sgosavi.best;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    public EditText Name;
    public EditText Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText) findViewById(R.id.email);
        Password=(EditText) findViewById(R.id.pass);
        Button login=(Button) findViewById(R.id.log);
        Button Signup=(Button)findViewById(R.id.sign);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
                validatef(Name.getText().toString() , Password.getText().toString());
            }
        });


    }

    private void validatef(String Name, String Password){

          if(Name.equals("Farmer1")&& Password.equals("24680")){
              Intent farm=new Intent(MainActivity.this,Main2Activity.class);
              startActivity(farm);
          }



      }
    private void validate(String Name, String Password) {
        if (Name.equals("User1") && Password.equals("12345")) {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);

        }
        }
    }
