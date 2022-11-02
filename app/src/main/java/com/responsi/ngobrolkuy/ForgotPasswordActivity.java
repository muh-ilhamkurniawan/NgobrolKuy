package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
    public void cekEmail(View view) {
        Intent cek = new Intent(ForgotPasswordActivity.this, CekEmailActivity.class);
        startActivity(cek);
    }
    public void login(View view) {
        Intent login = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
        startActivity(login);
    }
}