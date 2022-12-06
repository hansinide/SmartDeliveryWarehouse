package com.example.smartdeliverywarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class riderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_page);
        Button button7=findViewById(R.id.storkeeperhp3);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(riderPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button button4=findViewById(R.id.Riderlogin);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(riderPage.this,RiderMainPage.class);
                startActivity(intent);
            }
        });
    }
}