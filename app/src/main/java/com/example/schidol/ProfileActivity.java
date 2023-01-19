package com.example.schidol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private TextView textName;
    private TextView textEmail;
    private Button btnLogout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textName = findViewById(R.id.name);
        textEmail = findViewById(R.id.email);
        btnLogout = findViewById(R.id.btn_logout);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        textName.setText(firebaseUser.getDisplayName());
        textEmail.setText(firebaseUser.getEmail());

        if(firebaseUser != null){
            textName.setText(firebaseUser.getDisplayName());
            textEmail.setText(firebaseUser.getEmail());
        }else{
            textName.setText("Login unsuccessfully");
        }

        btnLogout.setOnClickListener(v ->{
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });

    }
}