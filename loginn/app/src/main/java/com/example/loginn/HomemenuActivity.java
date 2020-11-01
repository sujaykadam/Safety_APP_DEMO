package com.example.loginn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomemenuActivity extends AppCompatActivity {
    private EditText etC1;
    private EditText etC2;
    private EditText etC3;

    private Button btnContact;
    private TextView tvContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemenu);

        etC1 = (EditText) findViewById(R.id.etC1);
        etC1 = (EditText) findViewById(R.id.etC2);
        etC1 = (EditText) findViewById(R.id.etC3);

        btnContact = (Button) findViewById(R.id.btnContact);
        tvContact = (TextView)findViewById(R.id.tvContact);

    }
}