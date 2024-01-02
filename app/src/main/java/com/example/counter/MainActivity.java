package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView output , heder;
    Button btn , reset ;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        heder = findViewById(R.id.heder);
        btn = findViewById(R.id.mybtn);
        reset = findViewById(R.id.reset);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(""+counter() );
            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(""+reset());
            }
        });
    }
    public  int counter(){
        return ++count;
    }
    public int reset(){
        count=0;
        return  count;
    }
}