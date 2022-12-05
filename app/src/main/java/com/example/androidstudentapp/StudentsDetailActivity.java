package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_detail);


        findViewById(R.id.edit_student_save_btn)
                .setOnClickListener( view -> startActivity(
                        new Intent(this, EditStudentActivity.class)
                ));

    }
}