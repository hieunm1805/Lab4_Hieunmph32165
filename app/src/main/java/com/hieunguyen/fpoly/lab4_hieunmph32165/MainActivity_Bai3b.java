package com.hieunguyen.fpoly.lab4_hieunmph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_Bai3b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai3b);
        EditText txtname = findViewById(R.id.edt_User);
        EditText txtpass = findViewById(R.id.edt_Pass);
        EditText txtconfirm = findViewById(R.id.edt_Retypepass);
        Button btndangki = findViewById(R.id.btn_back);

        btndangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtname.getText().toString();
                String pass = txtpass.getText().toString();
                String confirm = txtconfirm.getText().toString();
                if (TextUtils.isEmpty(name) | TextUtils.isEmpty(pass) | TextUtils.isEmpty(confirm)) {
                    Toast.makeText(MainActivity_Bai3b.this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    if (pass.equals((confirm))) {
                        Toast.makeText(MainActivity_Bai3b.this, "Đăng kí thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity_Bai3b.this, MainActivity_Bai3.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("name", name);
                        bundle.putString("pass", pass);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity_Bai3b.this, "Đăng kí thất bại", Toast.LENGTH_SHORT).show();
                    }
                }


            }

        });
    }
}




