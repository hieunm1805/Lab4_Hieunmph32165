package com.hieunguyen.fpoly.lab4_hieunmph32165;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnGui;
    EditText edtGui;
    TextView txtNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGui = findViewById(R.id.btn_send);
        edtGui = findViewById(R.id.edt_send);
        txtNhan = findViewById(R.id.txt_price);

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("guidulieu", edtGui.getText().toString());
                getQuote.launch(i);
            }
        });



    }
    ActivityResultLauncher<Intent> getQuote = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode()==1){
                Intent intent = result.getData();
                if(intent != null){
                    Bundle bundle = intent.getExtras();
                    String qriceQuote = bundle.getString("guiGia");
                    txtNhan.setText(qriceQuote);
                }
            }
        }
    });
}
