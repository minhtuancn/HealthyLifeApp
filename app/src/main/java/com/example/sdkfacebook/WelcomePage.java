package com.example.sdkfacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sdkfacebook.mainactivity.MainHealthLifePage;

public class WelcomePage extends AppCompatActivity {

    EditText edtFirstNameWc, edtLastNameWc, edtDateOfBirthWc;
    Button btConfirmWc;
    TextView txtLogOutWc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Mapping();

        GoToMainHealthLifePage();
    }

    private void Mapping() {
        edtFirstNameWc = (EditText) findViewById(R.id.editTextFirstNameWc);
        edtLastNameWc = (EditText) findViewById(R.id.editTextLastNameWc);
        edtDateOfBirthWc = (EditText) findViewById(R.id.editTextDateOfBirthWc);
        btConfirmWc = (Button) findViewById(R.id.buttonConfirmWc);
        txtLogOutWc = (TextView) findViewById(R.id.textViewLogOutWc);
    }

    private void GoToMainHealthLifePage() {
        btConfirmWc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePage.this, MainHealthLifePage.class);
                startActivity(intent);
            }
        });
    }
}