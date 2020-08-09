package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class demo3 extends AppCompatActivity {

    EditText fname;
    EditText lname;
    EditText add;
    private RadioGroup radgrp;
    RadioButton rbtn;
    CheckBox ch1,ch2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        add = findViewById(R.id.add);
        radgrp = findViewById(R.id.radgrp);
        btn = findViewById(R.id.btn);
        ch1 = (CheckBox) findViewById(R.id.checkbox_1);
        ch2 = (CheckBox) findViewById(R.id.checkbox_2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fname = fname.getText().toString();
                String Lname = lname.getText().toString();
                String Add = add.getText().toString();
                rbtn = findViewById(radgrp.getCheckedRadioButtonId());
                String gender = rbtn.getText().toString();
                String msg= "";
                if (ch1.isChecked()){
                    msg = msg+"Readding";
                }
                if (ch1.isChecked()){
                    msg = msg+"Playimg";
                }
                Toast.makeText(demo3.this, Fname+Lname+Add+gender+msg, Toast.LENGTH_SHORT).show();

            }
        });


    }



}

