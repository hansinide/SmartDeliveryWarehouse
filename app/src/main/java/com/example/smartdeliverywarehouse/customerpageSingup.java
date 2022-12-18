package com.example.smartdeliverywarehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smartdeliverywarehouse.Model.User;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class customerpageSingup extends AppCompatActivity {
    EditText editTextTextPhoneNumber,editTextTextPersonName,editTextTextPassword;
    Button loginnewuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpage_singup);

        editTextTextPhoneNumber= (EditText) findViewById(R.id.editTextTextPhoneNumber);
        editTextTextPersonName= (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPassword= (EditText) findViewById(R.id.editTextTextPassword);

        FirebaseDatabase database= FirebaseDatabase.getInstance();
        DatabaseReference table_user= database.getReference("User");

        Button button11 = findViewById(R.id.loginnewuser);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        User user =  snapshot.child(editTextTextPhoneNumber.getText().toString()).getValue(User.class);
                        if(user.getPassword().equals(editTextTextPassword.getText().toString()))
                        {
                            Toast.makeText(customerpageSingup.this, "Sing In Success", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(customerpageSingup.this, "Sing In Fail!!", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

    }
}