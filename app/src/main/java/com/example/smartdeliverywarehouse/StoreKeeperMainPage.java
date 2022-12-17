package com.example.smartdeliverywarehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreKeeperMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_keeper_main_page);

        Button buttonHomepage = findViewById(R.id.buttonHomepage);

        buttonHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(StoreKeeperMainPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}