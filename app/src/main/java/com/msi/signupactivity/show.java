package com.msi.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class show extends AppCompatActivity {

    TextView UserName,email,address,phoneN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        UserName = findViewById(R.id.UserName);
        email  = findViewById(R.id.emailid);
        address = findViewById(R.id.addresses);
        phoneN = findViewById(R.id.phoneN);



        String uName = getIntent().getStringExtra("userName");
        String eMailId = getIntent().getStringExtra("email");
        String aDdress = getIntent().getStringExtra("address");
        String PhOne = getIntent().getStringExtra("phone");

        UserName.setText(uName);
        email.setText(eMailId);
        address.setText(aDdress);
        phoneN.setText(PhOne);
    }
}