package com.hieunguyen.fpoly.lab4_hieunmph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hieunguyen.fpoly.lab4_hieunmph32165.MainActivity_Bai3b;

public class MainActivity_Bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai3);
        EditText txtname =findViewById(R.id.edt_username);
        EditText txtpass=findViewById(R.id.edt_password);
        Button btndangnhap=findViewById(R.id.btn_login);
        Button btndangki=findViewById(R.id.btn_register);
        btndangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity_Bai3.this, MainActivity_Bai3b.class);
                startActivity(intent);
            }
        });

//Sử Lý Đăng Nhập
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getIntent();
                Bundle bundle=i.getExtras();
                if(bundle!=null){
                    //Nhận dữ Liệu
                    String uesrname=bundle.getString("name");
                    String password=bundle.getString("pass");
                    boolean u=uesrname.equals(txtname.getText().toString());
                    boolean p=uesrname.equals(txtpass.getText().toString());
                    if (u&&p){
                        Toast.makeText(MainActivity_Bai3.this, "Đăng Nhập Thành công", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity_Bai3.this, "ĐĂng Kí THất bại", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity_Bai3.this, "Chưa DĂng Kí", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}