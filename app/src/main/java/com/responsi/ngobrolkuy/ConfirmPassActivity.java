package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pass);
    }
    public void updatePass(View view) {
        Intent update = new Intent(ConfirmPassActivity.this, UpdatePasswordActivity.class);
        startActivity(update);
    }
    public void homeChat(View view) {
        Intent home = new Intent(ConfirmPassActivity.this, HomeChatActivity.class);
        startActivity(home);
    }
}