package com.example.quagnitia.contactwsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView txtName, txtEmail, txtPhone;
    //  String name = "", email = "", phone = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initUi();
    }


    private void initUi() {
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);


        String name = txtName.getText().toString().trim();
        String email = txtEmail.getText().toString().trim();
        String phone = txtPhone.getText().toString().trim();

        name = getIntent().getStringExtra(name);
        email = getIntent().getStringExtra(email);
        phone = getIntent().getStringExtra(phone);

        txtName.setText(name);
        txtEmail.setText(email);
        txtPhone.setText(phone);


    }
}
