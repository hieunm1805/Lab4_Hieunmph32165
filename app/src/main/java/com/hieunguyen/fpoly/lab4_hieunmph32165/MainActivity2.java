package com.hieunguyen.fpoly.lab4_hieunmph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btnBaoGia;
    EditText edtGiaNhap;
    TextView txtNhanVe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBaoGia = findViewById(R.id.btn_back);
        edtGiaNhap = findViewById(R.id.edt_price);
        txtNhanVe = findViewById(R.id.txt_item);

        Intent intent = getIntent();
        String price = intent.getStringExtra("guidulieu");
        txtNhanVe.setText(price);

        btnBaoGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String priceQuote = edtGiaNhap.getText().toString();
                Intent i = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("guiGia", priceQuote);
                i.putExtras(bundle);
                setResult(1, i);
                finish();

            }
        });
    }
}