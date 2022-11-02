package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void updatePass(View view) {
        Intent update = new Intent(SettingActivity.this, UpdatePasswordActivity.class);
        startActivity(update);
    }
    public void homeChat(View view) {
        Intent home = new Intent(SettingActivity.this, HomeChatActivity.class);
        startActivity(home);
    }
}