package com.example.smartdeliverywarehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smartdeliverywarehouse.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;


public class customerpage extends AppCompatActivity {

    EditText editTextTextPhoneNumber,editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpage);

        editTextTextPhoneNumber=(MaterialEditText)findViewById(R.id.userPhoneNumber);
        editTextTextPassword= (MaterialEditText)findViewById(R.id.editPassword);

        FirebaseDatabase database= FirebaseDatabase.getInstance();
        DatabaseReference table_user= database.getReference("User");

        Button cLogin=findViewById(R.id.customerLogin);
        cLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ProgressDialog mDialog= new ProgressDialog(customerpage.this);
                mDialog.setMessage("Please wait");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    //if (snapshot.child(editTextTextPhoneNumber.getText().toString()).exists()) {
                      //  mDialog.dismiss();

                        User user = snapshot.child(editTextTextPhoneNumber.getText().toString()).getValue(User.class);
                        if (user.getPassword().equals(editTextTextPassword.getText().toString()))
                        {
                            Toast.makeText(customerpage.this, "Sing In Success", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(customerpage.this, customerMainPage.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(customerpage.this, "Sing In Fail!!", Toast.LENGTH_SHORT).show();
                        }
                   // } else
                   // {
                     //   Toast.makeText(customerpage.this, "User not exit in the System", Toast.LENGTH_SHORT).show();
                   // }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            }
        });

        Button button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(customerpage.this,MainActivity.class);
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


