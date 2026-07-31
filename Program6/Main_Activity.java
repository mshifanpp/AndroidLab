package com.example.presentaition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gridlayout.R;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button sum, sub, mul, div;
    TextView rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        n1 = findViewById(R.id.editTextText);
        n2 = findViewById(R.id.editTextText2);

        sum = findViewById(R.id.button5);
        sub = findViewById(R.id.button6);
        mul = findViewById(R.id.button8);
        div = findViewById(R.id.button7);

        rslt = findViewById(R.id.textView3);

        // Addition
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInput()) {
                    int f1 = Integer.parseInt(n1.getText().toString());
                    int f2 = Integer.parseInt(n2.getText().toString());

                    rslt.setText("Addition = " + (f1 + f2));
                }
            }
        });

        // Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInput()) {
                    int f1 = Integer.parseInt(n1.getText().toString());
                    int f2 = Integer.parseInt(n2.getText().toString());

                    rslt.setText("Subtraction = " + (f1 - f2));
                }
            }
        });

        // Multiplication
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInput()) {
                    int f1 = Integer.parseInt(n1.getText().toString());
                    int f2 = Integer.parseInt(n2.getText().toString());

                    rslt.setText("Multiplication = " + (f1 * f2));
                }
            }
        });

        // Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInput()) {
                    int f1 = Integer.parseInt(n1.getText().toString());
                    int f2 = Integer.parseInt(n2.getText().toString());

                    if (f2 == 0) {
                        Toast.makeText(MainActivity.this,
                                "Cannot divide by zero",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        rslt.setText("Division = " + (f1 / f2));
                    }
                }
            }
        });
    }

    private boolean checkInput() {
        if (n1.getText().toString().trim().isEmpty() ||
                n2.getText().toString().trim().isEmpty()) {

            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
