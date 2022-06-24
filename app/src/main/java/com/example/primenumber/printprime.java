package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class printprime extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printprime);
        et1 = (EditText)findViewById(R.id.edtext);
        et2 = (EditText)findViewById(R.id.edtext2);
        tv1 = (TextView)findViewById(R.id.txtview);
        tv2 = (TextView)findViewById(R.id.textView8);

    }
    public void button3(View view) {
        et1 = (EditText)findViewById(R.id.edtext);
        et2 = (EditText)findViewById(R.id.edtext2);
        tv1 = (TextView)findViewById(R.id.txtview);
        tv2 = (TextView)findViewById(R.id.textView8);
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();
        StringBuilder ans = new StringBuilder();
        long a = Long.parseLong(num1);
        long b = Long.parseLong(num2);
        long p=0;
        for(long i=a;i<=b;i++) {
            long c = 0;
            double k = Math.sqrt(i);
            long m = (long)k;
            if(i==1 || i==0) {
                c=1;
            }
            for(long j=2;j<=m;j++){
                if(i%j==0) {
                    c=1;
                    break;
                }
            }
            if(c==0) {
                p++;
                ans.append(i +",");
            }
        }
        tv2.setText("Total no. of Prime number between "+a+" and "+b+" are : "+p);
        tv1.setText("Prime number between "+a+" and "+b+" are : \n"+ans.toString());
    }
}