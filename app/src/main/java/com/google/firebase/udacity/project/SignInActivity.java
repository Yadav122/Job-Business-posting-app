package com.google.firebase.udacity.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.udacity.project.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {
    ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        binding= ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.changePhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SignInActivity.this,ChangePhoneNumber.class);
                startActivity(intent);

            }
        });
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.phoneNumber.getText().toString().isEmpty()){
                    binding.phoneNumber.setError("Enter your Phone Number ");
                    return;
                }
                else {
                    Intent intent=new Intent(SignInActivity.this,ExploreScreen.class);
                    startActivity(intent);
                }

            }
        });
    }
}