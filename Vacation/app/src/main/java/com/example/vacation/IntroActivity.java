package com.example.vacation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Button bt = findViewById(R.id.button3);
        bt.setOnClickListener(view -> {
            Intent ac = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(ac);
        });
    }
}
