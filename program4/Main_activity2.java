package com.example.registration;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.actvity_main2);
        t1=findViewById(R.id.textView);
        String name =getIntent().getStringExtra("username");
        t1.setText("wlcome"+name);
    }
}
