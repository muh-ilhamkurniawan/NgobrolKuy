package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CekEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_email);
    }
    public void login(View view) {
        Intent login = new Intent(CekEmailActivity.this, LoginActivity.class);
        startActivity(login);
    }
    public void forgot(View view) {
        Intent lupa = new Intent(CekEmailActivity.this, ForgotPasswordActivity.class);
        startActivity(lupa);
    }
}