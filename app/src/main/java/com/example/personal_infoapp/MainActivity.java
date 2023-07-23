package com.example.personal_infoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,age,phone,email,university,blood,birth;
    Button submitBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.edtName);
        age = findViewById(R.id.edtAge);
        phone = findViewById(R.id.edtPhone);
        email = findViewById(R.id.edtEmail);
        university = findViewById(R.id.edtUniversity);
        blood = findViewById(R.id.edtBlood);
        birth = findViewById(R.id.edtBirth);
        textView = findViewById(R.id.viewId);

        submitBtn = findViewById(R.id.btnSubmit);
        submitBtn.setOnClickListener(this::onClick);


    }

    public void onClick(View v) {
        String name1 = name.getText().toString();
        String age1 = age.getText().toString();
        String phone1 = phone.getText().toString();
        String email1 = email.getText().toString();
        String university1 = university.getText().toString();
        String blood1 = blood.getText().toString();
        String birth1 = birth.getText().toString();

        if(v.getId()==R.id.btnSubmit){
            textView.setText("Name: "+name1+"\nAge: "+age1+"\nPhone number: "+phone1+"\nEmail: "+email1+"\nUniversity: "+university1+"\nBlood Group: "+blood1+"\nBirth: "+birth1);

        }

    }
}