package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    EditText num1;
    EditText num2;
    Button add;
    Button sub;
    Button multi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.Add);
        add.setOnClickListener(new AddButtonClickHandler());
        sub = (Button) findViewById(R.id.Sub);
        sub.setOnClickListener(new SubButtonClickHandler());
        multi = (Button) findViewById(R.id.Multi);
        multi.setOnClickListener(new MultiButtonClickHandler());


    }
    public class AddButtonClickHandler implements OnClickListener {

        public void onClick(View view){
            int numb1 = Integer.parseInt(num1.getText().toString());
            int numb2 = Integer.parseInt(num2.getText().toString());
            Intent xx = new Intent(MyActivity.this, Result.class);


            xx.putExtra("SUM", numb1 + "+" + numb2 + "=" + (numb1 + numb2));
            startActivity(xx);
        }
    }
    public class SubButtonClickHandler implements OnClickListener{

        public void onClick(View view){
            int numb1 = Integer.parseInt(num1.getText().toString());
            int numb2 = Integer.parseInt(num2.getText().toString());
            Intent ii = new Intent(MyActivity.this, Result.class);

            Bundle data1 = new Bundle();
            data1.putDouble("SUB", numb1);
            data1.putDouble("SUB1",numb2);
            ii.putExtras(data1);
            startActivityForResult(ii,101);
            //ii.putExtra("SUB", numb1 + "-" + numb2 + "=" + (numb1 - numb2));
            //startActivity(ii);
        }
    }
    public class MultiButtonClickHandler implements OnClickListener{

        public void onClick(View view){
            int numb1 = Integer.parseInt(num1.getText().toString());
            int numb2 = Integer.parseInt(num2.getText().toString ());
            Intent jj = new Intent(MyActivity.this, Result.class);

            Bundle data2 = new Bundle();
            data2.putDouble("MULTI",numb1);
            data2.putDouble("MULTI1",numb2);
            jj.putExtras(data2);
            startActivityForResult(jj,102);
            //jj.putExtra("Multi", numb1 + "*" + numb2 + "=" + (numb1 * numb2));
            //startActivity(jj);
        }
    }
}
