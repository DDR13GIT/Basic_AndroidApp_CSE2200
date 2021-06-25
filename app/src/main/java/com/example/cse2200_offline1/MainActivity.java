package com.example.cse2200_offline1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView txt1 = (TextView) findViewById(R.id.textView1);
        TextView txt2 = (TextView) findViewById(R.id.textView2);
        TextView txt3 = (TextView) findViewById(R.id.textView3);
        TextView txt4 = (TextView) findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello world");
                txt1.setText("HELLO");
                txt2.setText("KEEP");
                txt3.setText("BREATHING");
                txt4.setText("WORLD");

            }
        });

    }
}