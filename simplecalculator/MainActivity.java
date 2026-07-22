package com.example.presentaition;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum,sub,mul,div;
    TextView rslt;
    @SuppressLint("MissingInflated")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.editTextText);
        n2 = findViewById(R.id.editTextText2);

        div = findViewById(R.id.div);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);

        rslt = findViewById(R.id.textView2);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 + f2;
                rslt.setText("Addition = " + cal);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 - f2;
                rslt.setText("Subtraction = " + cal);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 =Integer.parseInt(n1.getText().toString());
                int f2 =Integer.parseInt(n2.getText().toString());
                int cal = f1 / f2;
                rslt.setText("Division ="+ cal);

            }
        } );
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 =Integer.parseInt(n1.getText().toString());
                int f2 =Integer.parseInt(n2.getText().toString());
                int cal = f1 * f2;
                rslt.setText("Multiplication ="+cal);
            }
        });

    }
}
