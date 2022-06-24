package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView2);
    }

    public void button(View view) {
        String num = et.getText().toString();
        long n = Long.parseLong(num);
        int c=0;
        double k = Math.sqrt(n);
        long m =(long)k;
        if(n==1 || n==0) {
            c=1;
        }
        for(long i=2; i<=m; i++ )
        {
            if(n%i == 0){
                c=1;
                break;
            }
        }
         if(c==0) {
             tv.setText(n+" : is a Prime Number");
            }
         else {
             tv.setText(n+" : is not a Prime Number");
         }
    }
     public void button2(View view) {
         Intent intent = new  Intent(MainActivity.this,printprime.class);
         startActivity(intent);
     }

    }
