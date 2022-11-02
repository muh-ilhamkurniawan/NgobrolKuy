package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdatePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);
    }
    public void setting(View view) {
        Intent set = new Intent(UpdatePasswordActivity.this, SettingActivity.class);
        startActivity(set);
    }
    public void confirm(View view) {
        Intent confirm = new Intent(UpdatePasswordActivity.this, ConfirmPassActivity.class);
        startActivity(confirm);
    }
}