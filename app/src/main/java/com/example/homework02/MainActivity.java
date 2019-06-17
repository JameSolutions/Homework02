package com.example.homework02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewFirstName;
    TextView textViewLastName;
    TextView textViewPhone;
    TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFirstName = findViewById(R.id.textViewFirstName);
        textViewLastName = findViewById(R.id.textViewLastName);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewEmail = findViewById(R.id.textViewEmail);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        String phone = intent.getStringExtra("Phone");
        String email = intent.getStringExtra("Email");

        textViewFirstName.setText(firstName);
        textViewLastName.setText(lastName);
        textViewPhone.setText(phone);
        textViewEmail.setText(email);
    }
}
