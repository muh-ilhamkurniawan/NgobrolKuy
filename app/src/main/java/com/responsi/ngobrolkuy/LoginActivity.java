package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void registrasi(View view) {
        Intent regis = new Intent( LoginActivity.this, RegisterActivity.class);
        startActivity(regis);
    }
    public void forgot(View view) {
        Intent lupa = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(lupa);
    }
    public void profil(View view) {
        Intent profil = new Intent(LoginActivity.this, ProfilePicActivity.class);
        startActivity(profil);
    }
}