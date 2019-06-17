package com.example.homework02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextFirstName;
    EditText editTextLastName;
    EditText editTextPhone;
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
    }

    public void onClickRegister(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("FirstName", editTextFirstName.getText().toString());
        intent.putExtra("LastName", editTextLastName.getText().toString());
        intent.putExtra("Phone", editTextPhone.getText().toString());
        intent.putExtra("Email", editTextEmail.getText().toString());
        startActivity(intent);
    }
}
