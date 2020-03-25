package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText,passwoedEditText;
    private Button loginButton;
    private TextView textView;
    private int counter=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=(EditText)findViewById(R.id.usernameId);
        passwoedEditText=(EditText) findViewById(R.id.userpassId);
        loginButton=(Button) findViewById(R.id.loginButtonId);
        textView=(TextView)findViewById(R.id.textViewId);
        textView.setText("Number of attempts remaining: 3");

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String username=usernameEditText.getText().toString();
                String password=passwoedEditText.getText().toString();

                if(username.equals("Jannat")&& password.equals("1234"))
                {
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    counter--;
                    textView.setText("Number of attempts remaining: "+counter);
                    Toast.makeText(MainActivity.this,"Wrong User Name or Password", Toast.LENGTH_SHORT).show();
                    if(counter==0)
                    {
                        loginButton.setEnabled(false);
                    }

                }

            }
        });
    }
}
