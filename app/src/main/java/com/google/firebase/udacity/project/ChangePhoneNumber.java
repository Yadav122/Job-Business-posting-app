package com.google.firebase.udacity.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.udacity.project.databinding.ActivityChangePhoneNumberBinding;

public class ChangePhoneNumber extends AppCompatActivity {
    ActivityChangePhoneNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        binding=ActivityChangePhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ChangePhoneNumber.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}