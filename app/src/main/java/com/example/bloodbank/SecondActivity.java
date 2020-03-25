package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button aboutBloodButton;
    private Button findblood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(SecondActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        aboutBloodButton=(Button)findViewById(R.id.aboutGroupId);
        aboutBloodButton.setOnClickListener(this);

        findblood=(Button)findViewById(R.id.findBloodId);
        findblood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.aboutGroupId){
            Intent intent = new Intent(SecondActivity.this, AboutBlood.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.findBloodId){
            Intent findIntent=new Intent(SecondActivity.this,FindBlood.class);
            startActivity(findIntent);

        }


    }
}
