package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutBlood extends AppCompatActivity implements View.OnClickListener {
    private ImageView bloodType,bloodRures,bloodChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_blood);

        bloodType=(ImageView)findViewById(R.id.bloodTypeId);
        bloodRures=(ImageView)findViewById(R.id.bloodRulesId);
        bloodChart=(ImageView)findViewById(R.id.bloodChartId);

        bloodType.setOnClickListener(this);
        bloodRures.setOnClickListener(this);
        bloodChart.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.bloodTypeId)
        {
            bloodType.setVisibility(View.GONE);
            bloodRures.setVisibility(View.VISIBLE);
        }

       else if(view.getId()==R.id.bloodRulesId)
        {
            bloodRures.setVisibility(View.GONE);
            bloodChart.setVisibility(View.VISIBLE);
        }

        else if(view.getId()==R.id.bloodChartId)
        {
            bloodChart.setVisibility(View.GONE);
            bloodType.setVisibility(View.VISIBLE);
        }

    }
}
