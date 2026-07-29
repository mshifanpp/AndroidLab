package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etName,etEmail,etPassword;
    Button btnRegister;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editTextText);
        etEmail = findViewById(R.id.editTextText2);
        etPassword=findViewById(R.id.editTextText3);
        btnRegister=findViewById(R.id.button);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String email=etEmail.getText().toString();
                String password=etPassword.getText().toString();
                sp = getSharedPreferences("UserDetails", MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("name",name);
                editor.putString("email",email);
                editor.putString("password",password);
                editor.commit();

                Toast.makeText(MainActivity.this,
                        "Rgistration SUccessful",
                        Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,
                        MainActivity2.class);
                intent.putExtra("username",name);
                startActivity(intent);

            }
        });

    }
}
