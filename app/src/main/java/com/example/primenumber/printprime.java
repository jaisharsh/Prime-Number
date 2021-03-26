package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class printprime extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printprime);
        et1 = (EditText)findViewById(R.id.edtext);
        et2 = (EditText)findViewById(R.id.edtext2);
        tv1 = (TextView)findViewById(R.id.txtview);

    }
    public void button3(View view) {
        et1 = (EditText)findViewById(R.id.edtext);
        et2 = (EditText)findViewById(R.id.edtext2);
        tv1 = (TextView)findViewById(R.id.txtview);
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();
        StringBuilder ans = new StringBuilder();
        long a = Long.parseLong(num1);
        long b = Long.parseLong(num2);
        for(long i=a;i<=b;i++) {
            long c = 0;
            for(long j=1;j<=i;j++){
                if(i%j==0) {
                    c++;
                }
            }
            if(c==2) {
                ans.append(i +",");
            }
        }
        tv1.setText("Prime number between "+a+" and "+b+" are : \n"+ans.toString());
    }
}