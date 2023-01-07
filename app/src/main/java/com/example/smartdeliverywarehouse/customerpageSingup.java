package com.example.smartdeliverywarehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.smartdeliverywarehouse.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class customerpageSingup extends AppCompatActivity {

    MaterialEditText cPhone, cName, cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpage_singup);

        cPhone = (MaterialEditText)findViewById(R.id.editTextPhoneNumber);
        cName  = (MaterialEditText)findViewById(R.id.editTextPersonName);
        cpassword = (MaterialEditText)findViewById(R.id.editTextTextPassword);

        final FirebaseDatabase database= FirebaseDatabase.getInstance();
        final DatabaseReference table_user= database.getReference("User");

        Button loginnew = findViewById(R.id.loginnewuser);
        loginnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog mDialog= new ProgressDialog(customerpageSingup.this);
                mDialog.setMessage("Please wait");

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child(cPhone.getText().toString()).exists())
                        {
                            mDialog.dismiss();
                            Toast.makeText(customerpageSingup.this, "Phone Number is already registered !!", Toast.LENGTH_SHORT).show();


                        }
                        else
                        {
                            mDialog.dismiss();
                            User user= new User(cName.getText().toString(),cpassword.getText().toString());
                            table_user.child(cPhone.getText().toString()).setValue(user);
                            Toast.makeText(customerpageSingup.this, "Successfully Registered !!!", Toast.LENGTH_SHORT).show();
                            finish();

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
