package com.example.loginn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {
    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;
    private TextView tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);
    }
}