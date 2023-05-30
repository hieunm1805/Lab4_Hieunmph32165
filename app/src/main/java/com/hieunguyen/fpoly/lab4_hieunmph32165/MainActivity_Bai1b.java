package com.hieunguyen.fpoly.lab4_hieunmph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_Bai1b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai1b);

        Button btn_trove = findViewById(R.id.btn_back);
        btn_trove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity_Bai1.class);
                startActivity(intent);
            }
        });
    }
}