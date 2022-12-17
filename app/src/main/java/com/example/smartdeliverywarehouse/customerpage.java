package com.example.smartdeliverywarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class customerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpage);
        Button button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(customerpage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button button4=findViewById(R.id.customerLogin);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(customerpage.this,customerMainPage.class);
                startActivity(intent);
            }
        });

        Button button10 = findViewById(R.id.singUp);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(customerpage.this,customerpageSingup.class);
                startActivity(intent);
            }
        });
            }
        }


