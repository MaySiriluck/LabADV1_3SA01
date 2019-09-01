package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editH;
    EditText editB;
    TextView textAnswer;

    Button btnChTriangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editH = findViewById(R.id.h);
        editB = findViewById(R.id.b);
        textAnswer = findViewById(R.id.answer);


        btnChTriangle = findViewById(R.id.ChTriangle);


        btnChTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChTriangle();
            }
        });
    }

    void ChTriangle() {
        String hStr = editH.getText().toString();
        String bStr = editB.getText().toString();
        float h = Float.parseFloat(hStr);
        float b = Float.parseFloat(bStr);
        float answer = ((h*b)/2);
        textAnswer.setText(answer + "");
    }
}
