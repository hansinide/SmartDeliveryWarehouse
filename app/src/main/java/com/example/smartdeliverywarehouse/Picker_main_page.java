package com.example.smartdeliverywarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Picker_main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_main_page);

        Button viewOrder = findViewById(R.id.buttonViewOrder);

        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Picker_main_page.this,View_order.class);
                startActivity(intent);
            }
        });
        Button buttonHome = findViewById(R.id.BtnHomePage);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Picker_main_page.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}