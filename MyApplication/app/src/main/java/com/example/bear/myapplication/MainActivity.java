package com.example.bear.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ok;
    Button clear;
    EditText etm;
    EditText epn;
    EditText eam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=(Button)findViewById(R.id.button);
         clear=(Button)findViewById(R.id.button2);

         etm=(EditText)findViewById(R.id.editText);
        epn=(EditText)findViewById(R.id.editText2);
        eam=(EditText)findViewById(R.id.editText3);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = etm.getText().toString();
                float a = Float.parseFloat(str);
                str = epn.getText().toString();
                float b= Float.parseFloat(str);
                float c=a/b;
                str=String.valueOf(c);
                eam.setText(str);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if (etm != null) {
                    etm.getText().clear();
                }
                if (epn != null) {
                    epn.getText().clear();
                }
                if (eam != null) {
                    eam.getText().clear();
                }
            }
        });
    }
}
