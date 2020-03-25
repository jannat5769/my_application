package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindBlood extends AppCompatActivity implements View.OnClickListener {
    private Button Apositive,Anegative,Bpositive,Bnegative;
    private Button Opositive,Onegative,ABpositive,ABnegative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_blood);

        Apositive=(Button)findViewById(R.id.AposId);
        Apositive.setOnClickListener(this);

        Anegative=(Button)findViewById(R.id.AnegId);
        Anegative.setOnClickListener(this);

        Bpositive=(Button)findViewById(R.id.BposId);
        Bpositive.setOnClickListener(this);

        Bnegative=(Button)findViewById(R.id.BnegId);
        Bnegative.setOnClickListener(this);

        Opositive=(Button)findViewById(R.id.OposId);
        Opositive.setOnClickListener(this);

        Onegative=(Button)findViewById(R.id.OnegId);
        Onegative.setOnClickListener(this);

        ABpositive=(Button)findViewById(R.id.ABposId);
        ABpositive.setOnClickListener(this);

        ABnegative=(Button)findViewById(R.id.ABnegId);
        ABnegative.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.AposId){
            Intent intent = new Intent(FindBlood.this, ApositiveActivity.class);
            startActivity(intent);
        }

        else if(v.getId()==R.id.AnegId){
            Intent intent=new Intent(FindBlood.this,AnegativeActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.BposId){
            Intent intent=new Intent(FindBlood.this,BpositiveActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.BnegId){
            Intent intent=new Intent(FindBlood.this,BnegativeActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.OposId){
            Intent intent=new Intent(FindBlood.this,OpositiveActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.OnegId){
            Intent intent=new Intent(FindBlood.this,OnegativeActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.ABposId){
            Intent intent=new Intent(FindBlood.this,ABpositiveActivity.class);
            startActivity(intent);

        }

        else if(v.getId()==R.id.ABnegId){
            Intent intent=new Intent(FindBlood.this,ABnegativeActivity.class);
            startActivity(intent);

        }

    }
}
