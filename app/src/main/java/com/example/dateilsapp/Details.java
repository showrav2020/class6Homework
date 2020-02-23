package com.example.dateilsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        TextView textView1=findViewById(R.id.tvDisplay1);
        TextView textView2=findViewById(R.id.tvDisplay2);
        TextView textView3=findViewById(R.id.tvDisplay3);


        textView1.setText(getIntent().getExtras().getString("str_key1"));
        textView2.setText(getIntent().getExtras().getString("str_key2"));
        textView3.setText(getIntent().getExtras().getString("str_key3"));
    }
}
