package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }*/
    private Button b0btn ;
    private Button bmoinsbtn;
    private Button bdivbtn;
    private TextView displayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0btn = findViewById(R.id.b0_button);
        bmoinsbtn = findViewById(R.id.bmoins_button);
        bdivbtn = findViewById(R.id.bdiv_button);
        displayTextView = findViewById(R.id.displayText);
        b0btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTextView.setText("0");
            }
        });
        bmoinsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTextView.setText("-");
            }
        });
        bdivbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTextView.setText("/");
            }
        });

    }
}