package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
    }
    public void setting(View view) {
        Intent set = new Intent(HomeChatActivity.this, SettingActivity.class);
        startActivity(set);
    }
    public void person(View view) {
        Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
        startActivity(chat);
    }
}