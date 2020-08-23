package com.example.reg_18e91a0539;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n,c,m;

    RadioButton m1,f1;

    String gender;

    Spinner branch;

    CheckBox c1,c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.first);

        c2=findViewById(R.id.second);

        branch=findViewById(R.id.sp);

        n=findViewById(R.id.name);
        c=findViewById(R.id.college);
        m=findViewById(R.id.phone);

        m1=findViewById(R.id.male);
        f1=findViewById(R.id.female);
    }

    public void movescreen(View view) {
        Intent i=new Intent(this,SecondScreen.class);
        startActivity(i);

        String username= n.getText().toString();

        String collegename= c.getText().toString();

        String mobile=m.getText().toString();

        if (m1.isChecked())
        {
            gender=m1.getText().toString();

        }
        else if(f1.isChecked())
        {
            gender=f1.getText().toString();
        }

        String b=branch.getSelectedItem().toString();

        StringBuilder sb=new StringBuilder();

        if(c1.isChecked())
        {
            sb.append("First\n");

        }
        else if(c2.isChecked())
        {
            sb.append("Second\n");
        }
        Intent i2=new Intent(this,SecondScreen.class);

        i2.putExtra("aa", (Parcelable) c1);

        i2.putExtra("bb", (Parcelable) c2);

        i2.putExtra("cc", (Parcelable) branch);
        i2.putExtra("dd", (Parcelable) n);
        i2.putExtra("ee", (Parcelable) c);
        i2.putExtra("ff", (Parcelable) m);
        i2.putExtra("cc", (Parcelable) m1);
        i2.putExtra("oo", (Parcelable) f1);
        startActivity(i2);

    }

}
