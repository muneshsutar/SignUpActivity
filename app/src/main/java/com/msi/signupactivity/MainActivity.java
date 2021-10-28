package com.msi.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,gmail,phone,address,pass;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        gmail = findViewById(R.id.gmail);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        pass = findViewById(R.id.pass);

        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                check();

            }

            private void check() {
                String uName = username.getText().toString();
                String eMail = gmail.getText().toString();
                String pn = phone.getText().toString();
                String adds = address.getText().toString();

                if (uName.matches("")){
                    if (eMail.matches("")){
                        if (pn.matches("")){
                            if (adds.matches("")){
                                Toast.makeText(getApplicationContext(), "Please FullFill All the place", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                }else {

                    Toast.makeText(getApplicationContext(), "Sign Up Sucesssfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,show.class);
                    intent.putExtra("userName",uName);
                    intent.putExtra("email",eMail);
                    intent.putExtra("phone",pn);
                    intent.putExtra("address",adds);
                    startActivity(intent);
                }

            }
        });





    }
}