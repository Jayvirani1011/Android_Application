package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text1 = findViewById(R.id.text1);
        final EditText text = findViewById(R.id.text);
        final EditText text2 = findViewById(R.id.text2);

        Button login = findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = text.getText().toString();
                String t2 = text2.getText().toString();
                text1.setText(t1+t2);
            }
        });

    }
}
