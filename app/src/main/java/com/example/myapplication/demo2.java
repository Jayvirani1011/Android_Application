package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class demo2 extends AppCompatActivity {
    EditText email;
    EditText pwd;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        email = findViewById(R.id.email);pwd = findViewById(R.id.pwd);
        btn = findViewById(R.id.btn);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String strEmail = email.getText().toString();
               String strPwd = pwd.getText().toString();
               Toast.makeText(demo2.this, strEmail+strPwd, Toast.LENGTH_SHORT).show();
           }
       });
    }
}
