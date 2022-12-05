package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class AddStudentActivity extends AppCompatActivity {
    TextView name,id,phone,address;
    CheckBox checkBox;
    Button cancel, save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        name  = findViewById(R.id.add_student_name_ed);
        id  = findViewById(R.id.add_student_id_et);
        phone  = findViewById(R.id.add_student_phone_ed);
        address  = findViewById(R.id.add_student_address_et);
        checkBox  = findViewById(R.id.add_student_checkbox);
        cancel  = findViewById(R.id.add_student_cancle_btn);
        save  = findViewById(R.id.add_student_save_btn);

        cancel.setOnClickListener(view -> finish());

    }
}