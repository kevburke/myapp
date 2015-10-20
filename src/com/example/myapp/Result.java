package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by g00295140 on 20/10/2015.
 */
public class Result extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView dataIn;
        Button complete;

        setContentView(R.layout.result);
        dataIn = (TextView) findViewById(R.id.textView3);
        complete = (Button) findViewById(R.id.complete);
        complete.setOnClickListener(this);

        Intent intent = getIntent();

        String sum = (String) intent.getSerializableExtra("SUM");
        String sub = (String) intent.getSerializableExtra("SUB");
        String multi = (String) intent.getSerializableExtra("Multi");
        result.setText(sum);
        result.setText(sub);
        result.setText(multi);
    }
}