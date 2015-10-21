package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by g00295140 on 20/10/2015.
 */
public class Result extends Activity implements View.OnClickListener {
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

        Bundle myBundle = intent.getExtras();

        Double n1 = myBundle.getDouble("SUB");
        Double n2 = myBundle.getDouble("SUB1");

        Double res = n1 - n2;

        dataIn.setText("Data is \n" + n1 + "-" + n2 + "="+ res);

        myBundle.putDouble("RESULT",res);

        intent.putExtras(myBundle);
        setResult(Activity.RESULT_OK,intent);
    }
    public void onClick(View v){
        finish();
    }
}