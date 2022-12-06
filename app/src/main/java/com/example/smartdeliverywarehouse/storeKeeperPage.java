package com.example.smartdeliverywarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class storeKeeperPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_store_keeper_page);
        Button button6=findViewById(R.id.storkeeperhp);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(storeKeeperPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button button4=findViewById(R.id.loginButton);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(storeKeeperPage.this,StoreKeeperMainPage.class);
                startActivity(intent);
            }
        });
    }
}