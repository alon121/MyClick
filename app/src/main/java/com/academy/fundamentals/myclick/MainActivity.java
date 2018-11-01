package com.academy.fundamentals.myclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View v)
    {
        TextView tv = (TextView)findViewById(R.id.textView1);
        String tvnum;
        tvnum = tv.getText().toString();
        Integer finalValue;
        finalValue = Integer.parseInt(tvnum);
        finalValue++;


        tv.setText(String.valueOf(finalValue));
    }
    public  void rest(View v){
        TextView myt;
        myt = (TextView)findViewById(R.id.textView1);

        int finalnum = 0;
        myt.setText(String.valueOf(finalnum));
    }
}




