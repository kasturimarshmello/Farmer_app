package com.example.sgosavi.best;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText address;
    String message;
    String msg;
    String message1;
    public final static  String KEY="com.example.sgosavi.best.key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    }

    public void send (View view){
        name= findViewById(R.id.nameatdetails);
        message= name.getText().toString();
        Intent intent =new Intent(DetailsActivity.this,GetdetailsActivity.class);
        intent.putExtra(KEY,message);
        startActivity(intent);

        phone= findViewById(R.id.contact);
        msg=phone.getText().toString();
        Intent intent1=new Intent(DetailsActivity.this,GetdetailsActivity.class);
        intent1.putExtra(KEY,msg);
        startActivity(intent1);

        address= findViewById(R.id.add);
        message1=address.getText().toString();
        Intent intent2=new Intent(DetailsActivity.this,GetdetailsActivity.class);
        intent2.putExtra(KEY,message1);
        startActivity(intent2);
    }









    }


