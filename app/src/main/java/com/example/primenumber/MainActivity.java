package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;

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
        for(long i=1; i<=n; i++ )
        {
            if(n%i == 0){
                c++;
            }
        }
         if(c==2) {
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
