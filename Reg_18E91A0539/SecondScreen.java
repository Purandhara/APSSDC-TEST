package com.example.reg_18e91a0539;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
      textView=findViewById(R.id.tv);

      String res=getIntent().getStringExtra("cc");




      textView.setText(res);

    }
}
