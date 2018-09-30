package com.example.mohamedalasklany.les6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Supplier extends AppCompatActivity {
    private TextView supp_name,supp_phone,supp_address,supp_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        supp_name=findViewById(R.id.supp_name);
        supp_phone=findViewById(R.id.supp_phone);
        supp_address=findViewById(R.id.supp_address);
        supp_mail=findViewById(R.id.supp_mail);
        supp_name.setText(getIntent().getStringExtra("name"));
        supp_phone.setText(getIntent().getStringExtra("phone"));
        supp_mail.setText(getIntent().getStringExtra("mail"));
        supp_address.setText(getIntent().getStringExtra("address"));
    }

}
