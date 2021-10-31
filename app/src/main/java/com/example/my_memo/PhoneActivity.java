package com.example.my_memo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        //inisial tombol
        Button btnVerificationActivity = findViewById(R.id.btn_next);

        //function tombol
        btnVerificationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext = new Intent(PhoneActivity.this, Android4Activity.class);
                startActivity(iNext);
            }
        });

    }
}