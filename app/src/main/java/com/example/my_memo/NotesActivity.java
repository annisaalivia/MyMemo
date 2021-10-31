package com.example.my_memo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        //inisial tombol
        ImageButton btnSave2 = findViewById(R.id.btn_save2);

        //function tombol
        btnSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSave2 = new Intent(NotesActivity.this, Android26Activity.class);
                startActivity(iSave2);
            }
        });
    }
}